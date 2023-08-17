package eje1.model;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private ArrayList<Perro> perro;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = new ArrayList<>();
    }

    public void adoptarPerro(Perro perro) {
        if(perro.getAdoptado())
            System.out.println("El perro ya fue adoptado");
        else
            this.perro.add(perro.builder().adoptado(true).build());
    }

    public String obtenerInfo() {
        String info = "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                '}';
        if (perro != null) {
            info += "\n" + perro.toString();
        }
        return info;
    }
}
