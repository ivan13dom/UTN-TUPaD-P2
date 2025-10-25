package tp7.ej3;
public class EmpleadoTemporal extends Empleado {
    private double valorHora; private int horas;
    public EmpleadoTemporal(String nombre, double valorHora, int horas){ super(nombre); this.valorHora = valorHora; this.horas = horas; }
    public double calcularSueldo(){ return valorHora * horas; }
}
