package tp8.ecommerce;
public class Cliente implements Notificable {
    private String nombre;
    public Cliente(String nombre){ this.nombre = nombre; }
    public void notificar(String mensaje){
        System.out.println(nombre + " notificado: " + mensaje);
    }
}
