package com.utn.tp3;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Ana", "Perez", "P2", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        e.bajarCalificacion(0.5);
        e.mostrarInfo();

        Mascota m = new Mascota("Luna", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        Libro l = new Libro("El Principito", "Saint-Exupéry", 1943);
        l.setAnioPublicacion(-1);
        l.setAnioPublicacion(1950);
        System.out.println(l.info());

        Gallina g1 = new Gallina("G1", 1);
        Gallina g2 = new Gallina("G2", 2);
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        NaveEspacial n = new NaveEspacial("Andes", 50);
        n.despegar();
        n.avanzar(60);
        n.recargarCombustible(40);
        n.avanzar(30);
        n.mostrarEstado();
    }
}
