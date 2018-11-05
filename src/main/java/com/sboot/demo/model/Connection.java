package com.sboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Connection {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String hostname;
    private Long port;
    private String databaseName;
    private String username;
    private String password;

    public Connection() {
    }

    public Connection(String name, String hostname, Long port, String databaseName, String username, String password) {
        this.name = name;
        this.hostname = hostname;
        this.port = port;
        this.databaseName = databaseName;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public Connection setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Connection setName(String name) {
        this.name = name;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public Connection setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Long getPort() {
        return port;
    }

    public Connection setPort(Long port) {
        this.port = port;
        return this;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public Connection setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Connection setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Connection setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hostname='" + hostname + '\'' +
                ", port=" + port +
                ", databaseName='" + databaseName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
