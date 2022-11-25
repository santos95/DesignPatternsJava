package com.patterns.structural.adapter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Etl implements Scheduler{
    private String dagId;
    private String owner;
    private String schedule;

    private String state;

    public String getDagId() {
        return dagId;
    }

    public void setDagId(String dagId) {
        this.dagId = dagId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Etl{" +
                "dagId='" + dagId + '\'' +
                ", owner='" + owner + '\'' +
                ", schedule='" + schedule + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void execute(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.now();
        long duration;

        System.out.printf("%s INFO - INICIANDO\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a MongoDB\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - BASE DE DATOS MONGO: SIE\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - MONGO COLLECTIONS: TRANSACCIONES_M TRANSACCIONES D\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a SqlServer\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a SqlServer\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Fecha Inicio: 2022-11-22T16:10:01.937Z\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Fecha Fin: %s\n", now, now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Procesando ... \n", now);
        now = LocalDateTime.now();
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Borrado Masivo \n", now);
        System.out.printf("%s INFO - Registros Eliminados Encabezado (sie):  0\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados encabezado 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados encabezado 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados encabezado 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Total Registros Insertados Encabezado (SIE): 75000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados Detalle 25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros Insertados Detalle (sie): 175200\n", now);
        now = LocalDateTime.now();
        duration = Duration.between(start, now).toMillis();
        System.out.printf("%s INFO - Tiempo transcurrido total %s s\n ", now, duration);
    }
}
