
package tp5.ej8;
public class FirmaDigital {
    private final String hash;
    private final String fecha;
    private final UsuarioFirma usuario; // agregación
    public FirmaDigital(String hash, String fecha, UsuarioFirma usuario){ this.hash=hash; this.fecha=fecha; this.usuario=usuario; }
    public String getHash(){ return hash; }
    public String getFecha(){ return fecha; }
    public UsuarioFirma getUsuario(){ return usuario; }
}
