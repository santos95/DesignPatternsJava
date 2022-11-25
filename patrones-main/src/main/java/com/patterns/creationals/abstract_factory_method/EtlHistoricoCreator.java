package com.patterns.creationals.abstract_factory_method;

public class EtlHistoricoCreator extends EtlFactory{
    @Override
    EtlCargaInicial crearEtlCargaInicial() {
        return new EtlCargaInicialHistorico();
    }

    @Override
    EtlIncremental crearEtlIncremental() {
        return new EtlIncrementalHistorico();
    }
}
