
package tp5;

public class MainTP5 {
    public static void main(String[] args) {
        // EJ1
        tp5.ej1.Titular titular = new tp5.ej1.Titular("Ana", "123");
        tp5.ej1.Pasaporte pasaporte = new tp5.ej1.Pasaporte("X999", "2024-01-01", "foto.png", "png");
        pasaporte.setTitular(titular);

        // EJ2
        tp5.ej2.Bateria bat = new tp5.ej2.Bateria("BT-01", 4000);
        tp5.ej2.Celular cel = new tp5.ej2.Celular("111", "Moto", "G", bat);
        tp5.ej2.Usuario userTel = new tp5.ej2.Usuario("Luis", "777");
        cel.setUsuario(userTel);

        // EJ7
        tp5.ej7.Motor motor = new tp5.ej7.Motor("V8", "MS-9");
        tp5.ej7.Vehiculo veh = new tp5.ej7.Vehiculo("AA000BB", "Sedan", motor);
        tp5.ej7.Conductor cond = new tp5.ej7.Conductor("Pepe", "A1");
        veh.setConductor(cond);

        // EJ11
        tp5.ej11.Reproductor rep = new tp5.ej11.Reproductor();
        rep.reproducir(new tp5.ej11.Cancion("Tema 1", new tp5.ej11.Artista("Banda", "Rock")));

        // EJ12
        double iva = new tp5.ej12.Calculadora().calcularIVA(new tp5.ej12.Impuesto(1000, new tp5.ej12.Contribuyente("X","20-1")));
        System.out.println("IVA calculado: " + iva);

        // EJ13
        tp5.ej13.CodigoQR qr = new tp5.ej13.GeneradorQR().generar("ABCD-123", new tp5.ej13.UsuarioQR("Meli","m@x.com"));
        System.out.println("QR generado: " + qr.getValor());

        // EJ14
        tp5.ej14.Render render = new tp5.ej14.EditorVideo().exportar("mp4", new tp5.ej14.Proyecto("Demo", 2));
        System.out.println("Formato exportado: " + render.getFormato());
    }
}
