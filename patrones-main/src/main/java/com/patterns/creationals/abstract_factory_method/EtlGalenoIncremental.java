package com.patterns.creationals.abstract_factory_method;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EtlGalenoIncremental implements EtlIncremental{
    @Override
    public void ejecutarEtl() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.now();
        long duration;

        System.out.printf("%s INFO - INICIANDO\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Conectado a postgressql\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - BASE DE DATOS GalenoOlap \n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Fecha Inicio: 2022-11-22T16:10:01.937Z\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Fecha Fin: %s\n", now, now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Procesando ... \n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Borrado Masivo \n", now);
        System.out.printf("%s INFO - Registros Eliminados Encabezado gal_h_consumo:  25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados  25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Registros insertados  25000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Total Registros Insertados gal_h_consumo: 50000\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Total Registros Insertados gal_d_producto: 32055\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Total Registros Insertados gal_d_producto_categoria: 2055\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Total Registros Insertados gal_d_unidad_medida: 2055\n", now);
        now = LocalDateTime.now();
        System.out.printf("%s INFO - Total Registros Insertados gal_d_entidad: 5055\n", now);
        now = LocalDateTime.now();
        duration = Duration.between(start, now).toMillis();
        System.out.printf("%s INFO - Tiempo transcurrido total %s s\n ", now, duration);
    }
}
