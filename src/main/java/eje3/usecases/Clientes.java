package eje3.usecases;

import eje3.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;

public class Clientes {

    public static final Cliente C1 = new Cliente("Miguel", "Santori", "321654987", "miguelsartori@email.com", "Colon 312", "3513555951");
    public static final Cliente C2 = new Cliente("Mayte", "Urrutia", "654987321", "mayteurrt@email.com", "Colon 312", "3513555321");
    public static final Cliente C3 = new Cliente("Santiago", "Casper", "321987654", "santicasper@email.com", "Colon 312", "3513555357");
    public static final Cliente C4 = new Cliente("Miguel", "Santori", "321654987", "miguelsartori@email.com", "Colon 312", "3513555951");
    public static final ArrayList<Cliente> CLIENTES = new ArrayList<>(Arrays.asList(C1,C2,C3,C4));
}
