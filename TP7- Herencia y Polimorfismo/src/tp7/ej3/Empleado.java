package tp7.ej3;
public abstract class Empleado {
    protected String nombre;
    public Empleado(String nombre){ this.nombre = nombre; }
    public abstract double calcularSueldo();
    public String toString(){ return nombre + " $" + String.format("%.2f", calcularSueldo()); }
}
