
package tp5.ej4;
public class TarjetaDeCredito {
    private final String numero;
    private final String fechaVencimiento;
    private Cliente cliente; // bidireccional
    private final Banco banco; // agregación
    private double saldo;
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, double saldo){
        this.numero=numero; this.fechaVencimiento=fechaVencimiento; this.banco=banco; this.saldo=saldo;
    }
    public String getNumero(){ return numero; }
    public String getFechaVencimiento(){ return fechaVencimiento; }
    public Banco getBanco(){ return banco; }
    public Cliente getCliente(){ return cliente; }
    public double getSaldo(){ return saldo; }
    public boolean tieneSaldoDisponible(double monto){ return saldo >= monto; }
    public void descontar(double monto){ this.saldo -= monto; }
    public void setCliente(Cliente c){
        if(this.cliente == c) return;
        this.cliente=c;
        if(c!=null && c.getTarjeta()!=this){ c.setTarjeta(this); }
    }
}
