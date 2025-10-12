package Punto2;

public class Gerente implements Empleado {
    String nombre;
    double salario;

    public Gerente(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double Bono() {
        return salario * 0.5;
    }
}
