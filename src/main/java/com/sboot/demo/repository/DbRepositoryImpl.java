package com.sboot.demo.repository;

import com.sboot.demo.model.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DbRepositoryImpl implements DbRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static String SELECT_COLUMNS = "SELECT table_name, column_name, is_nullable, column_type, character_maximum_length, column_key " +
            "FROM INFORMATION_SCHEMA.COLUMNS " +
            "WHERE TABLE_SCHEMA = ? " +
            "AND TABLE_NAME = ?";

    private static String SELECT_SCHEMA_TABLES = "";


    @Override
    public List<Column> getColumnsBySchemaAndTableName(String schema, String tableName) {
        return jdbcTemplate.query(SELECT_COLUMNS, new Object[]{schema, tableName}, new BeanPropertyRowMapper<>(Column.class));
    }

}
