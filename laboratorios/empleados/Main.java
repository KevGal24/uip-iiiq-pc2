import Empleados.Gerente;
import Empleados.Tecnico;
public class Main {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Tecnico t1 = new Tecnico();
        g1.mostrar();
        g1.setA("Pablo");
        System.out.println("Gerente\n" + g1.getA());
        t1.mostrar();
        t1.trabajar();
        t1.setA("Pablo");
        t1.setB("Carlos");
        System.out.println("TECNICO\n" + t1.getA() + " " + t1.getB());
    }
}
