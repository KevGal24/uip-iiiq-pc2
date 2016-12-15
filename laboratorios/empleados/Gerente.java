package Empleados;

/**
 * Created by kgallardo on 10/27/2016.
 */
public class Gerente {
    private String Nombre;
    private String salario;
    private String departamento;
    private String nivel;

    public void mostrar() {
        System.out.println("Soy el Gerente.");
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
