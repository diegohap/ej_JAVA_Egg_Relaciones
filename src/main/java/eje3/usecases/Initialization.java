package eje3.usecases;

import eje3.model.Cliente;
import eje3.model.Poliza;
import eje3.model.Vehiculo;
import eje3.service.ClienteService;
import eje3.service.PolizaService;
import eje3.service.VehículoService;

import java.util.*;

public class Initialization {
    public static void initialize(ClienteService cs, VehículoService vs, PolizaService ps){
        Cliente c1 = new Cliente("Clara", "Martel", "987654321", "claramart@email.com", "Colon 312", "3513555987");
        ArrayList<Cliente> clientes = Clientes.CLIENTES;
        clientes.add(c1);
        clientes.forEach(c -> cs.add(c));
//        System.out.println("----   PRUEBA CLIENTES   ----");
//        cs.getAll().get().forEach(System.out::println);
//        cs.findByAttributeName("apellido", "Martel").get().forEach(System.out::println);
//        System.out.println(cs.update(c1, new Cliente("Clara", "Martel", "987654321", "claramart@email.com", "San Martin 312", "3513555987")));
//        cs.findByAttributeName("nombre", "Clara").get().forEach(System.out::println);

        Vehiculo v1 = new Vehiculo("Ford", "KA", 2015, "mt321654", "ch987654", "rojo", "Turismo");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>(Vehiculos.VEHICULOS);
        vehiculos.add(v1);
        vehiculos.forEach(v -> vs.add(v));

        Poliza p1 = new Poliza(3213,
                               new Date(2022,1,26),
                               new Date(2024,1,26),
                               24,
                               "credito,debito",
                               1200000.0,
                               true,
                               60000.0,
                               "terceros",
                               Clientes.C1,
                               Collections.singletonList(Vehiculos.V1),
                               Cuotas.CUOTAS_2_PAGAS_1_IMPAGA_VENCIDA
                );
        System.out.println(p1);
        ps.add(p1);
        ps.getAll().get().forEach(System.out::println);
    }
}
