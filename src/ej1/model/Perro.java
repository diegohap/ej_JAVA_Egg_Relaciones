package ej1.model;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
