package com.utn.tp3;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println(nombre + " preparada");
    }

    public void avanzar(int distancia) {
        int consumo = distancia;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println(nombre + " avanza " + distancia + " y queda " + combustible);
        } else {
            System.out.println("Combustible insuficiente");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            combustible += cantidad;
            if (combustible > 100) combustible = 100;
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " combustible " + combustible);
    }
}
