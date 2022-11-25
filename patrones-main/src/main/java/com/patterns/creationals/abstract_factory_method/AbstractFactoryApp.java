package com.patterns.creationals.abstract_factory_method;

public class AbstractFactoryApp {


    public static void main(String[] args) {
        EtlFactory etlFactory;
        String loadData = "CargaInicial";
        String origin = "Historico";


        if(origin.equals("Sie")){

            etlFactory = new EtlTransaccionesCreator();

            if(loadData.equals("Incremental")) {

                System.out.println(loadData + " " + origin);
                EtlIncremental etlIncremental = etlFactory.crearEtlIncremental();
                etlIncremental.ejecutarEtl();

            } else {

                System.out.println(loadData + " " + origin);
                EtlCargaInicial etlCargaInicial = etlFactory.crearEtlCargaInicial();
                etlCargaInicial.ejecutarEtl();

            }
        } else {

            etlFactory = new EtlHistoricoCreator();

            if(loadData.equals("Incremental")){

                System.out.println(loadData + " " + origin);
                EtlIncremental etlIncremental = etlFactory.crearEtlIncremental();
                etlIncremental.ejecutarEtl();

            } else {

                System.out.println(loadData + " " + origin);
                EtlCargaInicial etlCargaInicial = etlFactory.crearEtlCargaInicial();
                etlCargaInicial.ejecutarEtl();


            }


        }

    }
}
