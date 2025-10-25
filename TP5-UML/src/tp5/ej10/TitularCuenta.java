
package tp5.ej10;
public class TitularCuenta {
    private final String nombre;
    private final String dni;
    private CuentaBancaria cuenta;
    public TitularCuenta(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    public String getNombre(){ return nombre; }
    public String getDni(){ return dni; }
    public CuentaBancaria getCuenta(){ return cuenta; }
    public void setCuenta(CuentaBancaria c){
        if(this.cuenta == c) return;
        this.cuenta=c;
        if(c!=null && c.getTitular()!=this){ c.setTitular(this); }
    }
}
