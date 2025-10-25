
package tp5.ej11;
public class Reproductor {
    public void reproducir(Cancion cancion){ // dependencia de uso
        System.out.println("▶ Reproduciendo: " + cancion.getTitulo() + " - " + cancion.getArtista().getNombre());
    }
}
