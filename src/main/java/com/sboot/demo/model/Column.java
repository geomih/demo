package com.sboot.demo.model;


public class Column {

    private String tableName;
    private String columnName;
    private String isNullable;
    private String columnType;
    private String columnKey;
    private Long characterMaximumLength;


    public String getTableName() {
        return tableName;
    }

    public Column setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getColumnName() {
        return columnName;
    }

    public Column setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public Column setIsNullable(String isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    public String getColumnType() {
        return columnType;
    }

    public Column setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public Column setColumnKey(String columnKey) {
        this.columnKey = columnKey;
        return this;
    }

    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public Column setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
        return this;
    }

    @Override
    public String toString() {
        return "Column{" +
                "tableName='" + tableName + '\'' +
                ", columnName='" + columnName + '\'' +
                ", isNullable='" + isNullable + '\'' +
                ", columnType='" + columnType + '\'' +
                ", columnKey='" + columnKey + '\'' +
                ", characterMaximumLength=" + characterMaximumLength +
                '}';
    }
}
