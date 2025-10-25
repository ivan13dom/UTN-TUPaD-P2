
package tp5.ej5;
public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // composición
    private Propietario propietario;     // bidireccional
    public Computadora(String marca, String numeroSerie, String modeloPM, String chipset){
        this.marca=marca; this.numeroSerie=numeroSerie; this.placaMadre=new PlacaMadre(modeloPM, chipset);
    }
    public String getMarca(){ return marca; }
    public String getNumeroSerie(){ return numeroSerie; }
    public PlacaMadre getPlacaMadre(){ return placaMadre; }
    public Propietario getPropietario(){ return propietario; }
    public void setPropietario(Propietario p){
        if(this.propietario == p) return;
        this.propietario=p;
        if(p!=null && p.getComputadora()!=this){ p.setComputadora(this); }
    }
}
