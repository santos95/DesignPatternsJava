package com.patterns.creationals.builder;

public class BuilderApp {
    public static void main(String[] args) {
        Connection mongoConnection = new ConnectionBuilder()
                .setId(1)
                .setConn_id("Sie")
                .setConn_type("MongoDB")
                .setHost("localhost")
                .setSchema("sie")
                .setLogin("mongoUser")
                .setPassword("UGVwZXByb2RlcDIwMjAk")
                .setPort(27017)
                .setDescription("Mongo Dev Enviroment")
                .build();

        System.out.println(mongoConnection.toString());
    }


}
