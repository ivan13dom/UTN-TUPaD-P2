package tp7.ej3;
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    public EmpleadoPlanta(String nombre, double sueldoBase){ super(nombre); this.sueldoBase = sueldoBase; }
    public double calcularSueldo(){ return sueldoBase; }
}
