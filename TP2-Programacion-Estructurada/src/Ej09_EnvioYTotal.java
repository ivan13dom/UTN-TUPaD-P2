import java.util.Scanner;
public class Ej09_EnvioYTotal {
    public static double calcularCostoEnvio(double peso, String zona) {
        String z = zona.trim().toLowerCase();
        double tarifa = z.startsWith("nac") ? 5.0 : 10.0; // Nacional / Internacional
        return tarifa * peso;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar salto
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();
        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);
        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " + total);
    }
}
