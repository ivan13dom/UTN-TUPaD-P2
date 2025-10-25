
package tp5.ej5;
public class Propietario {
    private final String nombre;
    private final String dni;
    private Computadora computadora;
    public Propietario(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    public String getNombre(){ return nombre; }
    public String getDni(){ return dni; }
    public Computadora getComputadora(){ return computadora; }
    public void setComputadora(Computadora c){
        if(this.computadora == c) return;
        this.computadora=c;
        if(c!=null && c.getPropietario()!=this){ c.setPropietario(this); }
    }
}
