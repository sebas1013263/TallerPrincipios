package Punto7;



public class DatabaseManager implements ReservaRepository {
    @Override
    public void guardarReserva(Reserva reserva) {
        System.out.println("Guardando reserva en la base de datos");
    }

}
