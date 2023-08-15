package ej3;

import ej3.model.Baraja;
import ej3.model.Carta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        ArrayList<Carta> mano = baraja.darCartas(5);
        System.out.println("Mano de cartas:");
        for (Carta carta : mano) {
            System.out.println(carta);
        }

        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles());

        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
}
