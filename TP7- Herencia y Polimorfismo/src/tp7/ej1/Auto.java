package tp7.ej1;
public class Auto extends Vehiculo {
    private int cantidadPuertas;
    public Auto(String marca, String modelo, int cantidadPuertas){
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    public String mostrarInfo(){ return super.mostrarInfo() + " " + cantidadPuertas + "p"; }
}
