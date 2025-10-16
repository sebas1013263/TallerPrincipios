package Punto7;

public class HabitacionSuite implements TipoHabitacion {

    @Override
    public void reservar() {
        System.out.println("Reservando habitacion suite....");
    }

    @Override
    public String getNombre() {
        return "Suite";
    }
}
