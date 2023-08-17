package ej1.model;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;

    public Perro(String nombre, String raza, int edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
