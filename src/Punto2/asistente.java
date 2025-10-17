package Punto2;

public class asistente implements Empleado {
    String nombre;
    double salario;

    public asistente(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double Bono() {
        return salario * 0.1;
    }
}
