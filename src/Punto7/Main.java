package Punto7;

public class Main {
    public static void main(String[] args) {
        ReservaRepository repo = new DatabaseManager();
        NotificacionService email = new EmailService();
        ReservaController reservaController = new ReservaController(repo, email);

        Usuario usuario = new Usuario("Ana","ana@gmail.com","3154356789");

        TipoHabitacion sencilla = new habtacionSencilla();
        TipoHabitacion suite = new HabitacionSuite();

        reservaController.procesarReserva(usuario,sencilla);
        reservaController.procesarReserva(usuario,suite);
    }
}
