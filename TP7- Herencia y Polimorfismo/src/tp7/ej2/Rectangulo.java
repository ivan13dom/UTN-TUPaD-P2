package tp7.ej2;
public class Rectangulo extends Figura {
    private double ancho; private double alto;
    public Rectangulo(double ancho, double alto){ super("Rectangulo"); this.ancho = ancho < 0 ? 0 : ancho; this.alto = alto < 0 ? 0 : alto; }
    public double calcularArea(){ return ancho * alto; }
}
