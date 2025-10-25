package tp8.ecommerce;
public class PayPal implements PagoConDescuento {
    private String email;
    public PayPal(String email){ this.email = email; }
    public boolean procesarPago(double monto){ return monto > 0; }
    public double aplicarDescuento(double monto){ return monto * 0.90; }
}
