
package tp5.ej6;
public class Reserva {
    private final String fecha;
    private final String hora;
    private final Cliente cliente; // asociación
    private final Mesa mesa;       // agregación
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa){
        this.fecha=fecha; this.hora=hora; this.cliente=cliente; this.mesa=mesa;
    }
    public String getFecha(){ return fecha; }
    public String getHora(){ return hora; }
    public Cliente getCliente(){ return cliente; }
    public Mesa getMesa(){ return mesa; }
}
