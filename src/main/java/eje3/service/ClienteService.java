package eje3.service;

import eje3.model.Cliente;

import java.util.List;

public class ClienteService extends Service<Cliente>{
    private static ClienteService instance;
    private ClienteService(List<Cliente> t) {
        super(t);
    }
    public static ClienteService getInstance(List<Cliente> t){
        if(instance == null)
            instance = new ClienteService(t);
        return instance;
    }
}
