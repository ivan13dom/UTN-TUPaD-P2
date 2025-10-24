public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana Gómez", "Desarrolladora");
        Empleado e2 = new Empleado("Luis Pérez", "QA");
        Empleado e3 = new Empleado(50, "María Soto", "PM", 180000);
        e1.actualizarSalario(10.0);
        e2.actualizarSalario(15000);
        e3.actualizarSalario(5.0);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
