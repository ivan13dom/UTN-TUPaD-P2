
package tp5.ej12;
public class Calculadora {
    public double calcularIVA(Impuesto impuesto){ // dependencia de uso
        return impuesto.getMonto() * 0.21;
    }
}
