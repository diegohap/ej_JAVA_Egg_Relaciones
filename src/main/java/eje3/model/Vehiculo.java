package eje3.model;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
public class Vehiculo {
    private static Integer nId=0;
    private Integer id;
    private String marca;
    private String modelo;
    private Integer anio;
    private String numeroMotor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo(){
        id = nId;
        nId++;
    }

    public Vehiculo(String marca, String modelo, Integer anio, String numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        id = nId;
        nId++;
    }

    public static Comparator<Vehiculo> compareByMarca = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getMarca().compareTo(o2.getMarca());
        }
    };
    public static Comparator<Vehiculo> compareByModelo = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getModelo().compareTo(o2.getModelo());
        }
    };
    public static Comparator<Vehiculo> compareByNumMotor = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getNumeroMotor().compareTo(o2.getNumeroMotor());
        }
    };
    public static Comparator<Vehiculo> compareByChasis = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getChasis().compareTo(o2.getChasis());
        }
    };
    public static Comparator<Vehiculo> compareByAnio = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getAnio().compareTo(o2.getAnio());
        }
    };
    public static Comparator<Vehiculo> compareByColor = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getColor().compareTo(o2.getColor());
        }
    };public static Comparator<Vehiculo> compareByTipo = new Comparator<Vehiculo>() {
        @Override
        public int compare(Vehiculo o1, Vehiculo o2) {
            return o1.getTipo().compareTo(o2.getTipo());
        }
    };
}
