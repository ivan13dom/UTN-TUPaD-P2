package tp6;
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio < 0 ? 0 : precio;
        this.cantidad = cantidad < 0 ? 0 : cantidad;
        this.categoria = categoria;
    }
    public String getId(){ return id; }
    public String getNombre(){ return nombre; }
    public double getPrecio(){ return precio; }
    public int getCantidad(){ return cantidad; }
    public CategoriaProducto getCategoria(){ return categoria; }
    public void setCantidad(int nueva){ this.cantidad = nueva < 0 ? 0 : nueva; }
    public String toString(){
        return id + " - " + nombre + " $" + String.format("%.2f", precio) + " x" + cantidad + " [" + categoria + "]";
    }
    public void mostrarInfo(){
        System.out.println(toString() + " - " + categoria.getDescripcion());
    }
}
