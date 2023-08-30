package eje3.service;

import eje3.model.Vehiculo;

import java.util.List;

public class VehiculoService extends Service<Vehiculo>{

    private static VehiculoService instance;

    private VehiculoService(List<Vehiculo> t) {
        super(t);
    }

    public static VehiculoService getInstance(List<Vehiculo> t){
        if(instance == null)
            instance = new VehiculoService(t);
        return instance;
    }
}
