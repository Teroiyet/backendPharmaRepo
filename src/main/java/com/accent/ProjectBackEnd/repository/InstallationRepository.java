package com.accent.ProjectBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.accent.ProjectBackEnd.entity.InstallationEntity;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.data.repository.query.Param;

@Repository 
public interface InstallationRepository extends JpaRepository<InstallationEntity, Integer> {

@Query(value = " select i from InstallationEntity i where id = :id ")
public List<InstallationEntity> findByZoneId(@Param("id") int id);
}
