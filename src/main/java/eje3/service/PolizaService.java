package eje3.service;

import eje3.model.Poliza;

import java.util.List;

public class PolizaService extends Service<Poliza> {
    private static PolizaService instance;

    private PolizaService(List<Poliza> t) {
        super(t);
    }

    public static PolizaService getInstance(List<Poliza> t) {
        if(instance ==null)
            instance = new PolizaService(t);
        return instance;
    }
}
