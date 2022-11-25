package com.patterns.creationals.abstract_factory_method;

public abstract class EtlFactory {

    abstract EtlCargaInicial crearEtlCargaInicial();

    abstract EtlIncremental crearEtlIncremental();
}
