package tp5.ej14;

public class EditorVideo {

    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto \"" + proyecto.getNombre() + "\" a " + formato + "...");
        return new Render(formato, proyecto);
    }
}

