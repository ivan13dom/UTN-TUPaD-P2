
package tp5.ej7;
public class Vehiculo {
    private final String patente;
    private final String modelo;
    private final Motor motor; // agregación
    private Conductor conductor; // bidireccional
    public Vehiculo(String patente, String modelo, Motor motor){ this.patente=patente; this.modelo=modelo; this.motor=motor; }
    public String getPatente(){ return patente; }
    public String getModelo(){ return modelo; }
    public Motor getMotor(){ return motor; }
    public Conductor getConductor(){ return conductor; }
    public void setConductor(Conductor c){
        if(this.conductor == c) return;
        this.conductor=c;
        if(c!=null && c.getVehiculo()!=this){ c.setVehiculo(this); }
    }
}
