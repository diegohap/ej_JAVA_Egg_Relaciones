package eje2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Pelicula {
    String titulo;
    int duracion;
    int edadMinima;
    String director;
}
