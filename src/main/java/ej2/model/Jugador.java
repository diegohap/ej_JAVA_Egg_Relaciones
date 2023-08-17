package ej2.model;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverDeAgua revolver) {
        if (revolver.mojar()) {
            mojado = true;
            return true;
        } else {
            revolver.siguienteChorro();
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
