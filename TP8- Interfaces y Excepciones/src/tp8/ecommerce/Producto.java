package tp8.ecommerce;
public class Producto implements Pagable {
    private String nombre;
    private double precio;
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio < 0 ? 0 : precio;
    }
    public String getNombre(){ return nombre; }
    public double getPrecio(){ return precio; }
    public double calcularTotal(){ return precio; }
    public String toString(){ return nombre + " $" + String.format("%.2f", precio); }
}
