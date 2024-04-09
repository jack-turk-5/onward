// Author: Loc Ha
package com.onward.app.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * LineItemRepository interface for CRUD operations on LineItem entities.
 * Inherits JpaRepository to leverage Spring Data JPA functionalities.
 */
@Repository
public interface LineItemRepository extends JpaRepository<LineItem, Long> {
}
