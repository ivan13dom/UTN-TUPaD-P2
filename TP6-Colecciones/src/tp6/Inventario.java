package tp6;
import java.util.*;
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    public void agregarProducto(Producto p){ productos.add(p); }
    public void listarProductos(){
        for (Producto p : productos) p.mostrarInfo();
    }
    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) if (p.getId().equals(id)) return p;
        return null;
    }
    public boolean eliminarProducto(String id){
        Producto p = buscarProductoPorId(id);
        if (p == null) return false;
        return productos.remove(p);
    }
    public boolean actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p == null) return false;
        p.setCantidad(nuevaCantidad);
        return true;
    }
    public java.util.ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        java.util.ArrayList<Producto> res = new java.util.ArrayList<>();
        for (Producto p : productos) if (p.getCategoria() == categoria) res.add(p);
        return res;
    }
    public int obtenerTotalStock(){
        int s = 0;
        for (Producto p : productos) s += p.getCantidad();
        return s;
    }
    public Producto obtenerProductoConMayorStock(){
        if (productos.isEmpty()) return null;
        Producto m = productos.get(0);
        for (int i = 1; i < productos.size(); i++){
            if (productos.get(i).getCantidad() > m.getCantidad()) m = productos.get(i);
        }
        return m;
    }
    public java.util.ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        java.util.ArrayList<Producto> res = new java.util.ArrayList<>();
        for (Producto p : productos){
            double pr = p.getPrecio();
            if (pr >= min && pr <= max) res.add(p);
        }
        return res;
    }
    public void mostrarCategoriasDisponibles(){
        java.util.EnumSet<CategoriaProducto> set = java.util.EnumSet.noneOf(CategoriaProducto.class);
        for (Producto p : productos) set.add(p.getCategoria());
        for (CategoriaProducto c : set) System.out.println(c + " - " + c.getDescripcion());
    }
}
