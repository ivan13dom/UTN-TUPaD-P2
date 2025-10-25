
package tp5.ej8;
public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firma; // composición
    public Documento(String titulo, String contenido, String hash, String fecha, UsuarioFirma usuario){
        this.titulo=titulo; this.contenido=contenido; this.firma=new FirmaDigital(hash, fecha, usuario);
    }
    public String getTitulo(){ return titulo; }
    public String getContenido(){ return contenido; }
    public FirmaDigital getFirma(){ return firma; }
}
