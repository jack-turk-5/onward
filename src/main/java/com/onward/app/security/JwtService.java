package com.onward.app.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {

    //TODO change this to password manager
    public static final String SECRET = "G75GT3T4G54655435G4AQ0URJ3JB8BQTTV4Q08A93GYH9843H9UB3NT597765276Q1419I5J2NY56";
    public String generateToken(String userName) { 
        Map<String, Object> claims = new HashMap<>(); 
        return createToken(claims, userName); 
    } 
  
    private String createToken(Map<String, Object> claims, String userName) { 
        return Jwts.builder() 
                .claims(claims) 
                .subject(userName) 
                .issuedAt(new Date(System.currentTimeMillis())) 
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30)) 
                .signWith(getSignKey()).compact(); 
    } 
  
    private SecretKey getSignKey() { 
        byte[] keyBytes= Decoders.BASE64.decode(SECRET); 
        return Keys.hmacShaKeyFor(keyBytes); 
    } 
  
    public String extractUsername(String token) { 
        return extractClaim(token, Claims::getSubject); 
    } 
  
    public Date extractExpiration(String token) { 
        return extractClaim(token, Claims::getExpiration); 
    } 
  
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) { 
        final Claims claims = extractAllClaims(token); 
        return claimsResolver.apply(claims); 
    } 
  
    private Claims extractAllClaims(String token) { 
        return Jwts 
                .parser() 
                .verifyWith(getSignKey()) 
                .build() 
                .parseSignedClaims(token) 
                .getPayload(); 
    } 
  
    private Boolean isTokenExpired(String token) { 
        return extractExpiration(token).before(new Date()); 
    } 
  
    public Boolean validateToken(String token, UserDetails userDetails) { 
        final String username = extractUsername(token); 
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token)); 
    }
}
