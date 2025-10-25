
package tp5.ej14;
public class Render { 
    private final String formato; 
    private final Proyecto proyecto;
    public Render(String formato, Proyecto proyecto){ this.formato=formato; this.proyecto=proyecto; }
    public String getFormato(){ return formato; }
    public Proyecto getProyecto(){ return proyecto; }
}
