package eje3.usecases;

import eje3.model.Vehiculo;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehiculos {
    public static final Vehiculo V1 = new Vehiculo("Ford", "Ranger", 2018, "mt789456", "ch123456", "negro", "PickUp");
    public static final Vehiculo V2 = new Vehiculo("Renaul", "Kangoo", 2013, "mt456987", "ch321789", "blanco", "Van");
    public static final Vehiculo V3 = new Vehiculo("Peugeot", "3008", 2015, "mt654789", "ch159987", "azul", "Coupe");
    public static final Vehiculo V4 = new Vehiculo("Fiat", "Palio", 2013, "mt357951", "ch368126", "gris", "Turismo");
    public static final ArrayList<Vehiculo> VEHICULOS = new ArrayList<>(Arrays.asList(V1,V2,V3,V4));
}
