package eje1.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private Boolean adoptado = false;

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
