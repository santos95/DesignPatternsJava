package com.patterns.creationals.factory_method.etl_pensiones;

public class EtlTransaccionesCreator extends EtlCreator {
    @Override
    public Etl crearEtl() {
        return new EtlTransacciones();
    }
}
