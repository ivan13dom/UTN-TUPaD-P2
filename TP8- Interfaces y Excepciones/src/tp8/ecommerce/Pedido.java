package tp8.ecommerce;
import java.util.*;
public class Pedido implements Pagable {
    private ArrayList<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;
    public void agregarProducto(Producto p){ productos.add(p); }
    public void setCliente(Notificable c){ this.cliente = c; }
    public void cambiarEstado(String nuevo){
        this.estado = nuevo;
        if (cliente != null) cliente.notificar("Estado cambiado a " + nuevo);
    }
    public double calcularTotal(){
        double s = 0;
        for (Producto p : productos) s += p.calcularTotal();
        return s;
    }
    public ArrayList<Producto> getProductos(){ return productos; }
    public String getEstado(){ return estado; }
}
