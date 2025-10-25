package tp8.ecommerce;
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    public TarjetaCredito(String numero){ this.numero = numero; }
    public boolean procesarPago(double monto){ return monto > 0; }
    public double aplicarDescuento(double monto){ return monto * 0.95; }
}
