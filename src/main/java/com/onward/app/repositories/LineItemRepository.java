// Author: Loc Ha
package com.onward.app.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onward.app.entities.LineItem;

/**
 * LineItemRepository interface for CRUD operations on LineItem entities.
 * Inherits JpaRepository to leverage Spring Data JPA functionalities.
 */
@Repository
public interface LineItemRepository extends CrudRepository<LineItem, Long> {
}
