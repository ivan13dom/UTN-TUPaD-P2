
package tp5.ej13;
public class GeneradorQR {
    public CodigoQR generar(String valor, UsuarioQR usuario){ // dependencia de creación
        return new CodigoQR(valor, usuario);
    }
}
