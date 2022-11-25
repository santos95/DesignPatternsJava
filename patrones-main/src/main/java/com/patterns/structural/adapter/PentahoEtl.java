package com.patterns.structural.adapter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PentahoEtl {
    private String repo;
    private String user;
    private String pass;
    private String trans;
    private String state;




    public PentahoEtl(String repo, String user, String pass, String trans) {
        this.repo = repo;
        this.user = user;
        this.pass = pass;
        this.trans = trans;
    }

    public PentahoEtl getEtl(){
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public void execute(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.now();
        long duration;

        now = LocalDateTime.now();
        System.out.printf("%s INFO - Starting Job SIE_C_PERSONAS\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Fecha Inicio: 2022-11-22T16:10:01.937Z\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Iniciando EXTRACT_SIE_C_PERSONA\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a SIE_TEMPS\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Extract 100000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Extract 100000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Extract 100000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Inserted 300000 Into SIE_C_PERSONA_AUX\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Close connection SIE_TEMPS\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Iniciar BORRAR_SIE_C_PERSONA\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a SIE_TEMPS\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Executing Sql Script\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Close connection SIE_TEMPS\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Iniciando LOAD_SIE_C_PERSONA\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a OLAP_VERTICA\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Inserted 100000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Inserted 100000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Inserted 100000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Inserted 300000 Into SIE_C_PERSONAs\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Close connection OLAP_VERTICA\n", now);
        System.out.printf("%s INFO - Fecha Fin: %s\n", now, now);
        now = LocalDateTime.now();
        duration = Duration.between(start, now).toMillis();
        System.out.printf("%s INFO - Tiempo transcurrido total %s s\n ", now, duration);
        this.state = "0";
    }
}
