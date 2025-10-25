
package tp5.ej7;
public class Conductor {
    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo;
    public Conductor(String nombre, String licencia){ this.nombre=nombre; this.licencia=licencia; }
    public String getNombre(){ return nombre; }
    public String getLicencia(){ return licencia; }
    public Vehiculo getVehiculo(){ return vehiculo; }
    public void setVehiculo(Vehiculo v){
        if(this.vehiculo == v) return;
        this.vehiculo=v;
        if(v!=null && v.getConductor()!=this){ v.setConductor(this); }
    }
}
