package eje3.service;

import eje3.model.Cliente;
import eje3.model.Vehiculo;

import java.util.List;

public class VehículoService extends Service<Vehiculo>{

    private static VehículoService instance;

    private VehículoService(List<Vehiculo> t) {
        super(t);
    }

    public static VehículoService getInstance(List<Vehiculo> t){
        if(instance == null)
            instance = new VehículoService(t);
        return instance;
    }
}
