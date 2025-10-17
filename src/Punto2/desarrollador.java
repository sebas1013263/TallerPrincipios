package Punto2;

public class desarrollador implements Empleado{
    String nombre;
    double salario;

    public desarrollador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double Bono() {
        return salario * 0.2;
    }
}
