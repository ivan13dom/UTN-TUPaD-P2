import java.util.Scanner;
public class Ej04_DescuentoPorCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.next().trim().toUpperCase();
        double porcentaje;
        switch (cat) {
            case "A": porcentaje = 10; break;
            case "B": porcentaje = 15; break;
            case "C": porcentaje = 20; break;
            default: System.out.println("Categoría inválida."); return;
        }
        double descuento = precio * (porcentaje / 100.0);
        double finalPrecio = precio - descuento;
        System.out.println("Descuento aplicado: " + (int)porcentaje + "%");
        System.out.println("Precio final: " + finalPrecio);
    }
}
