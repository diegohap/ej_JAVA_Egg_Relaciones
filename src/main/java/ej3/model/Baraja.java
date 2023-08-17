package ej3.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Optional<Carta>siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return Optional.empty();
        }
        Carta carta = cartas.remove(0);
        monton.add(carta);
        return Optional.of(carta);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return new ArrayList<>();
        }
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            mano.add(siguienteCarta().get());
        }
        return mano;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Aún no se ha sacado ninguna carta.");
        } else {
            System.out.println("Cartas en el montón: ");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas en la baraja: ");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
