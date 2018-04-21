package com.arif.crud.repositories;

import com.arif.crud.models.DeveloperModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Arif Pehlivan
 */
@Repository
public interface DeveloperRepository extends JpaRepository<DeveloperModel, Long> {
}
