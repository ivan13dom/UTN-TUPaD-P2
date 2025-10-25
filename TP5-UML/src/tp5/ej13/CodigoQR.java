
package tp5.ej13;
public class CodigoQR { 
    private final String valor; 
    private final UsuarioQR usuario;
    public CodigoQR(String valor, UsuarioQR usuario){ this.valor=valor; this.usuario=usuario; }
    public String getValor(){ return valor; }
    public UsuarioQR getUsuario(){ return usuario; }
}
