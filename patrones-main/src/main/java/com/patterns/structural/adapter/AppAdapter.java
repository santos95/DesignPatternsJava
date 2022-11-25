package com.patterns.structural.adapter;

public class AppAdapter {
    public static void main(String[] args) {
        Etl DagPersona;
        PentahoAdapter EtlPersona = new PentahoAdapter();
        EtlPersona.execute();
        DagPersona = EtlPersona.getPentahoEtl();
        System.out.println(DagPersona.toString());

    }
}
