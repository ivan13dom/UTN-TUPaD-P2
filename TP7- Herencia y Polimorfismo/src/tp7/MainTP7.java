package tp7;
import tp7.ej1.Auto;
import tp7.ej2.*;
import tp7.ej3.*;
import tp7.ej4.*;
import java.util.*;
public class MainTP7 {
    public static void main(String[] args) {
        Auto a = new Auto("Toyota","Corolla",4);
        System.out.println(a.mostrarInfo());
        ArrayList<Figura> figs = new ArrayList<>();
        figs.add(new Circulo(3));
        figs.add(new Rectangulo(2,5));
        for (Figura f : figs) System.out.println(f.getNombre() + " area=" + String.format("%.2f", f.calcularArea()));
        ArrayList<Empleado> emps = new ArrayList<>();
        emps.add(new EmpleadoPlanta("Ivan", 800000));
        emps.add(new EmpleadoTemporal("Ana", 2000, 120));
        for (Empleado e : emps) {
            System.out.println(e);
            if (e instanceof EmpleadoTemporal) System.out.println("Temporal");
        }
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Perro());
        animals.add(new Gato());
        animals.add(new Vaca());
        for (Animal an : animals) System.out.println(an.describirAnimal() + ": " + an.hacerSonido());
    }
}
