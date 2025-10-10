public class Ej12_ArrayPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);
        precios[2] = 129.99; // modificar un producto puntual
        System.out.println("\nPrecios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }
}
