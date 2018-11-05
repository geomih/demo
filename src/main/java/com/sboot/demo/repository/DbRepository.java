package com.sboot.demo.repository;

import com.sboot.demo.model.Column;

import java.util.List;

public interface DbRepository {


    List<Column> getColumnsBySchemaAndTableName(String schema, String tableName);

}
