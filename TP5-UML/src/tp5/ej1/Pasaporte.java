
package tp5.ej1;
public class Pasaporte {
    private final String numero;
    private final String fechaEmision;
    private final Foto foto;
    private Titular titular;
    public Pasaporte(String numero, String fechaEmision, String img, String formato){
        this.numero=numero; this.fechaEmision=fechaEmision; this.foto=new Foto(img, formato);
    }
    public String getNumero(){ return numero; }
    public String getFechaEmision(){ return fechaEmision; }
    public Foto getFoto(){ return foto; }
    public Titular getTitular(){ return titular; }
    public void setTitular(Titular t){
        if(this.titular == t) return;
        this.titular = t;
        if(t!=null && t.getPasaporte()!=this){ t.setPasaporte(this); }
    }
}
