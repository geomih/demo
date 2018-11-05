package com.sboot.demo.service;

import com.sboot.demo.model.Column;
import com.sboot.demo.model.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbServiceTests {

    @Autowired
    private DbService dbService;

    @Test
    public void getAllSchemasTest() {
        List<String> schemas = dbService.getAllSchemas();
        assertThat(schemas.size()).isGreaterThan(0);
        System.out.println();
        schemas.stream().forEachOrdered(System.out::println);
        System.out.println();
    }

    @Test
    public void getAllTablesTest() {
        List<String> tables = dbService.getAllTables();
        assertThat(tables.size()).isGreaterThan(0);
        System.out.println();
        tables.stream().forEachOrdered(System.out::println);
        System.out.println();
    }

    @Test
    public void getAllConnectionsTest() {
        List<Connection> connections = dbService.getAllConnections();
        assertThat(connections.size()).isGreaterThan(0);
        System.out.println();
        connections.forEach(System.out::println);
        System.out.println();
    }

    @Test
    public void getColumnsByTableNameTest() {
        List<Column> columns = dbService.getColumnsByTableName("db1", "connection");
        assertThat(columns.size()).isGreaterThan(1);
        columns.forEach(System.out::println);
    }

}
