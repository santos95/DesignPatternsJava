package com.patterns.creationals.abstract_factory_method;

public class EtlTransaccionesCreator extends EtlFactory{
    @Override
    EtlCargaInicial crearEtlCargaInicial() {
        return new EtlCargaInicialTransacciones();
    }

    @Override
    EtlIncremental crearEtlIncremental() {
        return new EtlIncrementalTransacciones();
    }
}
