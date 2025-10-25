package tp8.excepciones;
import java.io.*;
public class Lecturas {
    public static String leerArchivo(String path) throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
