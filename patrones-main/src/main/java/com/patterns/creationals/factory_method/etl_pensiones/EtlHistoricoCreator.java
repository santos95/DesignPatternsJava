package com.patterns.creationals.factory_method.etl_pensiones;

public class EtlHistoricoCreator extends EtlCreator {
    @Override
    public Etl crearEtl() {
        return new EtlHistorico();
    }
}
