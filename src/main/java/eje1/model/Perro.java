package eje1.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private Boolean adoptado;

    public Perro(String nombre, String raza, int edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptado = false;
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
