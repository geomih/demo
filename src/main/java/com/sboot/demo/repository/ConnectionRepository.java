package com.sboot.demo.repository;

import com.sboot.demo.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Long> {

    @Query(value = "show schemas", nativeQuery = true)
    List<String> getAllSchemas();


    @Query(value = "show tables", nativeQuery = true)
    List<String> getAllTables();

    @Query(value = "SELECT TABLE_NAME FROM information_schema.tables WHERE table_schema = :schema", nativeQuery = true)
    List<String> getSchemaTables(@Param("schema") String schema);


}
