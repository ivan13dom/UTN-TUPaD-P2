
package tp5.ej2;
public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private final Bateria bateria; // agregación
    private Usuario usuario;       // asociación bidireccional
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei=imei; this.marca=marca; this.modelo=modelo; this.bateria=bateria;
    }
    public String getImei(){ return imei; }
    public String getMarca(){ return marca; }
    public String getModelo(){ return modelo; }
    public Bateria getBateria(){ return bateria; }
    public Usuario getUsuario(){ return usuario; }
    public void setUsuario(Usuario u){
        if(this.usuario == u) return;
        this.usuario=u;
        if(u!=null && u.getCelular()!=this){ u.setCelular(this); }
    }
}
