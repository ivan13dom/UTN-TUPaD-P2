package tp6;
public class MainTP6 {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.agregarProducto(new Producto("P01","Arroz",1200,30,CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02","Mouse",4500,40,CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P03","Sabanas",7000,12,CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P04","Remera",3500,20,CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P05","Auriculares",9000,8,CategoriaProducto.ELECTRONICA));
        inv.listarProductos();
        System.out.println(inv.buscarProductoPorId("P02"));
        System.out.println(inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA));
        inv.eliminarProducto("P03");
        inv.listarProductos();
        inv.actualizarStock("P04", 18);
        System.out.println(inv.obtenerTotalStock());
        System.out.println(inv.obtenerProductoConMayorStock());
        System.out.println(inv.filtrarProductosPorPrecio(1000, 3000));
        inv.mostrarCategoriasDisponibles();
    }
}
