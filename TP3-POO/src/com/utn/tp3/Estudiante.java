package com.utn.tp3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - " + curso + " - " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
    }
}
