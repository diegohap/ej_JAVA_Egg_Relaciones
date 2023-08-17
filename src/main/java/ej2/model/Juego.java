package ej2.model;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        while (true) {
            for (Jugador jugador : jugadores) {
                boolean mojado = jugador.disparo(revolver);
                if (mojado) {
                    System.out.println("¡" + jugador + " se mojó!");
                    return;
                }
            }
        }
    }
}
