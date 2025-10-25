
package tp5.ej8;
public class UsuarioFirma {
    private final String nombre;
    private final String email;
    public UsuarioFirma(String nombre, String email){ this.nombre=nombre; this.email=email; }
    public String getNombre(){ return nombre; }
    public String getEmail(){ return email; }
}
