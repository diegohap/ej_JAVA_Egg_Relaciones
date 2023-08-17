package ej1;

import ej1.model.Perro;
import ej1.model.Persona;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais", "Labrador", 3, "Mediano");
        Perro perro2 = new Perro("Luna", "Poodle", 2, "Pequeno");

        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678");
        Persona persona2 = new Persona("Maria", "Lopez", 25, "87654321");

        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        System.out.println(persona1.obtenerInfo());
        System.out.println(persona2.obtenerInfo());
    }
}
