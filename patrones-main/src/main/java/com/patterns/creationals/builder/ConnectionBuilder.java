package com.patterns.creationals.builder;

public class ConnectionBuilder {
    private Integer id;
    private String conn_id;
    private String conn_type;
    private String host;
    private String schema;
    private String login;
    private String password;
    private Integer port;
    private String description;

    public ConnectionBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public ConnectionBuilder setConn_id(String conn_id) {
        this.conn_id = conn_id;
        return this;
    }

    public ConnectionBuilder setConn_type(String conn_type) {
        this.conn_type = conn_type;
        return this;
    }

    public ConnectionBuilder setHost(String host) {
        this.host = host;
        return this;
    }

    public ConnectionBuilder setSchema(String schema) {
        this.schema = schema;
        return this;
    }

    public ConnectionBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public ConnectionBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public ConnectionBuilder setPort(Integer port) {
        this.port = port;
        return this;
    }

    public ConnectionBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Connection build() {
        return new Connection(id, conn_id, conn_type, host, schema, login, password, port, description);
    }

}
