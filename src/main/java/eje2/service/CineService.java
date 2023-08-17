package eje2.service;



import eje2.model.Cine;
import eje2.model.Espectador;
import eje2.model.Pelicula;

import java.util.Random;

public class CineService {

    private Cine cine;

    public CineService(Pelicula peliculaActual, double precioEntrada) {
        this.cine = new Cine(peliculaActual, precioEntrada, new Espectador[8][6]);
    }

    public void simular() {
        Random random = new Random();
        Espectador[][] sala = cine.getSala();
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                if (sala [fila][columna] == null) {
                    String letraFila = String.valueOf((char) ('A' + fila));
                    String asiento = letraFila + (columna + 1);

                    int edadEspectador = random.nextInt(50) + 10;
                    double dineroEspectador = random.nextDouble() * 50.0;

                    Espectador espectador = new Espectador("Espectador", edadEspectador, dineroEspectador);

                    if (espectador.getEdad() >= cine.getPeliculaActual().getEdadMinima() && espectador.getDinero() >= cine.getPrecioEntrada()) {
                        sala[fila][columna] = espectador;
                    }
                }
            }
        }
    }

    public String obtenerEstadoSala() {
        StringBuilder estadoSala = new StringBuilder("Estado de la sala:\n");
        Espectador[][] sala = cine.getSala();
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                if (sala[fila][columna] == null) {
                    estadoSala.append("   | ");
                } else {
                    estadoSala.append(" X | ");
                }
            }
            estadoSala.append("\n");
        }
        return estadoSala.toString();
    }
}
