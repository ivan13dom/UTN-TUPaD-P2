
package tp5.ej10;
public class CuentaBancaria {
    private final String cbu;
    private double saldo;
    private final ClaveSeguridad clave; // composición
    private TitularCuenta titular;      // bidireccional
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModif){
        this.cbu=cbu; this.saldo=saldo; this.clave=new ClaveSeguridad(codigo, ultimaModif);
    }
    public String getCbu(){ return cbu; }
    public double getSaldo(){ return saldo; }
    public ClaveSeguridad getClave(){ return clave; }
    public TitularCuenta getTitular(){ return titular; }
    public void setTitular(TitularCuenta t){
        if(this.titular == t) return;
        this.titular=t;
        if(t!=null && t.getCuenta()!=this){ t.setCuenta(this); }
    }
    public boolean tieneSaldoDisponible(double monto){ return saldo >= monto; }
    public void descontar(double monto){ this.saldo -= monto; }
}
