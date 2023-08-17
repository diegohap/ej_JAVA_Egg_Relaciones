package eje2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cine {
    private Pelicula peliculaActual;
    private double precioEntrada;
    private Espectador[][] sala;
}
