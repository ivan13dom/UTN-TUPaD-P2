package com.utn.tp3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= java.time.Year.now().getValue()) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año inválido: " + anio);
        }
    }

    public String info() {
        return """ + titulo + "" por " + autor + " (" + anioPublicacion + ")";
    }
}
