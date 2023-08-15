package ej1.model;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptarPerro(Perro perro) {
        this.perro = perro;
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
