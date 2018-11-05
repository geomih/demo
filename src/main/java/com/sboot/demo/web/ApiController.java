package com.sboot.demo.web;

import com.sboot.demo.model.Column;
import com.sboot.demo.model.Connection;
import com.sboot.demo.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ApiController {

    @Autowired
    private DbService dbService;

    @GetMapping(path = "/schemas", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<List<String>> schemas() {
        return ResponseEntity.ok(dbService.getAllSchemas());
    }

    @GetMapping(path = "/tables", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<List<String>> tables() {
        return ResponseEntity.ok(dbService.getAllTables());
    }

    @GetMapping(path = "/{schema}/tables", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<List<String>> getSchemaTables(@PathVariable String schema) {
        return ResponseEntity.ok(dbService.getSchemaTables(schema));
    }

    @GetMapping(path = "/connections", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<List<Connection>> connections() {
        return ResponseEntity.ok(dbService.getAllConnections());
    }

    @GetMapping(path = "/{schema}/{tableName}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Column>> getColumnsBySchemaAndTableNameJson(@PathVariable String schema, @PathVariable String tableName) {
        return ResponseEntity.ok(dbService.getColumnsByTableName(schema, tableName));
    }

    @GetMapping(path = "/{schema}/{tableName}.html", produces = MediaType.TEXT_HTML_VALUE)
    public String getColumnsBySchemaAndTableName(@PathVariable String schema, @PathVariable String tableName) {
        List<Column> columnsList = dbService.getColumnsByTableName(schema, tableName);
        String s = columnsList.stream().map(Column::toString).collect(Collectors.joining("<br>"));
        return "<html><body><h1>" + s + "</h1></body></html>";
    }

}
