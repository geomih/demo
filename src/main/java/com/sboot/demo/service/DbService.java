package com.sboot.demo.service;

import com.sboot.demo.model.Column;
import com.sboot.demo.model.Connection;

import java.util.List;

public interface DbService {

    List<String> getAllSchemas();

    List<String> getAllTables();

    List<String> getSchemaTables(String schema);

    List<Connection> getAllConnections();

    List<Column> getColumnsByTableName(String schema, String tableName);

}
