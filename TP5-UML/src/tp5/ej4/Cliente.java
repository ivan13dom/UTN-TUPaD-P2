
package tp5.ej4;
public class Cliente {
    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjeta;
    public Cliente(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }
    public String getNombre(){ return nombre; }
    public String getDni(){ return dni; }
    public TarjetaDeCredito getTarjeta(){ return tarjeta; }
    public void setTarjeta(TarjetaDeCredito t){
        if(this.tarjeta == t) return;
        this.tarjeta=t;
        if(t!=null && t.getCliente()!=this){ t.setCliente(this); }
    }
}
