package com.patterns.creationals.factory_method.etl_pensiones;

public class FactoryMethodApp {

    public static void main(String[] args) {

//        String origin = "HISTORICO";
        String origin = "SIE";
        Etl job;
        EtlCreator etlFactory;

        if(origin.equals("SIE")) {
            etlFactory = new EtlTransaccionesCreator();
            job = etlFactory.crearEtl();
            job.ejecutar();
        } else if(origin.equals("HISTORICO"))
        {
           etlFactory = new EtlHistoricoCreator();
           job = etlFactory.crearEtl();
           job.ejecutar();
        }
    }
}
