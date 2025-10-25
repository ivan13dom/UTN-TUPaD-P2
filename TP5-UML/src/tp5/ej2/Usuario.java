
package tp5.ej2;
public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular;
    public Usuario(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    public String getNombre(){ return nombre; }
    public String getDni(){ return dni; }
    public Celular getCelular(){ return celular; }
    public void setCelular(Celular c){
        if(this.celular == c) return;
        this.celular=c;
        if(c!=null && c.getUsuario()!=this){ c.setUsuario(this); }
    }
}
