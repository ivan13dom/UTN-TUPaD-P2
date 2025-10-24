public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int nextId = 0;
    private static final double SALARIO_POR_DEFECTO = 100000.0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = Math.max(0, salario);
        totalEmpleados++;
        if (id > nextId) nextId = id;
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++nextId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje) {
        if (porcentaje < 0) throw new IllegalArgumentException("El porcentaje debe ser >= 0");
        this.salario += this.salario * (porcentaje / 100.0);
    }

    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo < 0) throw new IllegalArgumentException("El aumento fijo debe ser >= 0");
        this.salario += aumentoFijo;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo");
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado {id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + String.format("%.2f", salario) + "}";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
