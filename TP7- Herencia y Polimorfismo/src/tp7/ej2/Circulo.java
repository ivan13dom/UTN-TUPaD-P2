package tp7.ej2;
public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio){ super("Circulo"); this.radio = radio < 0 ? 0 : radio; }
    public double calcularArea(){ return Math.PI * radio * radio; }
}
