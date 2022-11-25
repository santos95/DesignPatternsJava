package com.patterns.creationals.builder;

public class Connection {
    private Integer id;
    private String conn_id;
    private String conn_type;
    private String host;
    private String schema;
    private String login;
    private String password;
    private Integer port;
    private String description;

    public Connection() {
    }

    public Connection(Integer id, String conn_id, String conn_type, String host, String schema, String login, String password, Integer port, String description) {
        this.id = id;
        this.conn_id = conn_id;
        this.conn_type = conn_type;
        this.host = host;
        this.schema = schema;
        this.login = login;
        this.password = password;
        this.port = port;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConn_id() {
        return conn_id;
    }

    public void setConn_id(String conn_id) {
        this.conn_id = conn_id;
    }

    public String getConn_type() {
        return conn_type;
    }

    public void setConn_type(String conn_type) {
        this.conn_type = conn_type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "id=" + id +
                ", conn_id='" + conn_id + '\'' +
                ", conn_type='" + conn_type + '\'' +
                ", host='" + host + '\'' +
                ", schema='" + schema + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", description='" + description + '\'' +
                '}';
    }
}
