package eje3.model;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
public class Cliente {
    @ToString.Exclude
    private static Integer nId=0;
    private Integer id;
    private String nombre;
    private String apellido;
    private String documento;
    private String email;
    private String domicilio;
    private String telefono;

    public Cliente(){
        id = nId;
        nId++;
    }

    public Cliente(String nombre, String apellido, String documento, String email, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
        id = nId;
        nId++;
    }

    public static Comparator<Cliente> compareByNombre = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
    public static Comparator<Cliente> compareByApellido = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.getApellido().compareTo(o2.getApellido());
        }
    };
}