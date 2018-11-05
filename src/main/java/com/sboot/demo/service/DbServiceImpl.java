package com.sboot.demo.service;

import com.sboot.demo.model.Column;
import com.sboot.demo.model.Connection;
import com.sboot.demo.repository.ConnectionRepository;
import com.sboot.demo.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbServiceImpl implements DbService {

    @Autowired
    private ConnectionRepository connectionRepository;

    @Autowired
    private DbRepository dbRepository;

    @Override
    public List<String> getAllSchemas() {
        return connectionRepository.getAllSchemas();
    }

    @Override
    public List<String> getAllTables() {
        return connectionRepository.getAllTables();
    }

    @Override
    public List<String> getSchemaTables(String schema) {
        return connectionRepository.getSchemaTables(schema);
    }

    @Override
    public List<Connection> getAllConnections() {
        return connectionRepository.findAll();
    }

    @Override
    public List<Column> getColumnsByTableName(String schema, String tableName) {
        return dbRepository.getColumnsBySchemaAndTableName(schema, tableName);
    }

}
