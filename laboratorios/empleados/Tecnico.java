package Empleados;

/**
 * Created by kgallardo on 10/27/2016.
 */
public class Tecnico extends Empleados.Gerente {
    private String Nombre;
    private String salario;
    private String departamento;

    public void mostrar() {
        System.out.println("Soy el técnico.");
    }

    public void trabajar() {
        System.out.println("tengo que trabajar.");
    }

    public String getB(){
        return getNombre(), salario, departamento;
    }
    public void setB(String b) {
        this.getNombre(), salario, departamento = getNombre(), salario, departamento;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}