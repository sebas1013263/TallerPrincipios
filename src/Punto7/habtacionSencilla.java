package Punto7;

public class habtacionSencilla implements TipoHabitacion {

    @Override
    public void reservar() {
        System.out.println("Reservando habitacion sencilla.......");
    }

    @Override
    public String getNombre() {
        return "Sencilla";
    }
}
