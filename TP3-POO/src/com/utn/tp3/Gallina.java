package com.utn.tp3;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        this.huevosPuestos += 1;
    }

    public void envejecer() {
        this.edad += 1;
    }

    public void mostrarEstado() {
        System.out.println(idGallina + " - edad " + edad + " - huevos " + huevosPuestos);
    }
}
