
package tp5.ej1;
public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte;
    public Titular(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    public String getNombre(){ return nombre; }
    public String getDni(){ return dni; }
    public Pasaporte getPasaporte(){ return pasaporte; }
    public void setPasaporte(Pasaporte p){
        if(this.pasaporte == p) return;
        this.pasaporte = p;
        if(p!=null && p.getTitular()!=this){ p.setTitular(this); }
    }
}
