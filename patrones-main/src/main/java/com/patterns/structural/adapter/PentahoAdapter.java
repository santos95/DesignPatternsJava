package com.patterns.structural.adapter;

import java.lang.invoke.StringConcatFactory;

public class PentahoAdapter implements Scheduler{

    String schedule = "*/20 8-22 * * *";
    PentahoEtl EtlPersona = new PentahoEtl("Persona", "olp_usr", "ahsdhakjfsapfas=", "SIE_C_PERSONA");
    Etl etl = new Etl();
    public void execute(){

        System.out.printf("sh pan.sh -rep=%s -user=%s -pass=%s -trans=%s", EtlPersona.getRepo(),
                EtlPersona.getUser(), EtlPersona.getPass(), EtlPersona.getTrans());
        this.EtlPersona.execute();
    }

    public Etl getPentahoEtl(){
        etl.setDagId(EtlPersona.getTrans());
        etl.setOwner(EtlPersona.getUser());
        etl.setSchedule(schedule);
        if(EtlPersona.getState().equals("0")){
            etl.setState("Done");
        } else {
            etl.setState("Error");
        }

        return etl;

    }



}
