package com.patterns.creationals.factory_method.caso4;

public class Server extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    String getRam() {
        return this.ram;
    }

    @Override
    String getHdd() {
        return this.hdd;
    }

    @Override
    String getCpu() {
        return this.cpu;
    }
}
