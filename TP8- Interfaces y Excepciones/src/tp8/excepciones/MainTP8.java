package tp8.excepciones;
import tp8.ecommerce.*;
public class MainTP8 {
    public static void main(String[] args) {
        int a = 10; int b = 0;
        try {
            int r = a / b;
            System.out.println(r);
        } catch (ArithmeticException ex) {
            System.out.println("Division por cero");
        }
        String texto = "123a";
        try {
            int v = Integer.parseInt(texto);
            System.out.println(v);
        } catch (NumberFormatException ex) {
            System.out.println("Texto no convertible a entero");
        }
        try {
            String s = Lecturas.leerArchivo("no_existe.txt");
            System.out.println(s);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (java.io.IOException e) {
            System.out.println("Error de IO");
        }
        try {
            validarEdad(-3);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
        try {
            String s = Lecturas.leerArchivo("README.txt");
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Error leyendo README");
        }
        Cliente c = new Cliente("Ivan");
        Pedido pedido = new Pedido();
        pedido.setCliente(c);
        pedido.agregarProducto(new Producto("Teclado", 12000));
        pedido.agregarProducto(new Producto("Mouse", 7000));
        double total = pedido.calcularTotal();
        PagoConDescuento medio = new TarjetaCredito("4111");
        double conDesc = medio.aplicarDescuento(total);
        boolean ok = medio.procesarPago(conDesc);
        pedido.cambiarEstado(ok ? "PAGADO" : "RECHAZADO");
        System.out.println("Total: " + total + " Total con descuento: " + conDesc + " OK: " + ok);
    }
    static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) throw new EdadInvalidaException("Edad invalida: " + edad);
    }
}
