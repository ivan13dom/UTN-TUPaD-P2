
package tp5.ej12;
public class Impuesto {
    private final double monto; 
    private final Contribuyente contribuyente;
    public Impuesto(double monto, Contribuyente contribuyente){ this.monto=monto; this.contribuyente=contribuyente; }
    public double getMonto(){ return monto; }
    public Contribuyente getContribuyente(){ return contribuyente; }
}
