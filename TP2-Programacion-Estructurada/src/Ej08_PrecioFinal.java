import java.util.Scanner;
public class Ej08_PrecioFinal {
    public static double calcularPrecioFinal(double precioBase, double impuestoPorc, double descuentoPorc) {
        double imp = precioBase * (impuestoPorc / 100.0);
        double desc = precioBase * (descuentoPorc / 100.0);
        return precioBase + imp - desc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double imp = sc.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double desc = sc.nextDouble();
        double total = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + total);
    }
}
