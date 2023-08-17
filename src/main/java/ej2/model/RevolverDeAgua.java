package ej2.model;

import java.util.Random;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6); // 6 posiciones en el tambor
        posicionAgua = random.nextInt(6);
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}
