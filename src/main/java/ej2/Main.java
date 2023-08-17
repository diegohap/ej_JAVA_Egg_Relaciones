package ej2;

import ej2.model.Juego;
import ej2.model.Jugador;
import ej2.model.RevolverDeAgua;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);

        juego.ronda();
    }
}
