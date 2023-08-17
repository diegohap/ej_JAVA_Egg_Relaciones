package eje2;

import eje2.model.Pelicula;
import eje2.service.CineService;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Titanic", 120, 12, "James Cameron");
        CineService cineService = new CineService(pelicula, 10.0);

        cineService.simular();
        String estadoSala = cineService.obtenerEstadoSala();
        System.out.println(estadoSala);
    }
}
