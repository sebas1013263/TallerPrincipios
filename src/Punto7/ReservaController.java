package Punto7;

public class ReservaController {
    private final ReservaRepository reservaRepository;
    private final NotificacionService notificacionService;


    public ReservaController(ReservaRepository reservaRepository, NotificacionService notificacionService) {
        this.reservaRepository = reservaRepository;
        this.notificacionService = notificacionService;
    }
    public void procesarReserva(Usuario usuario, TipoHabitacion habitacion) {
        Reserva reserva = new Reserva();
        reserva.crearReserva(usuario,habitacion);

        // Guardar en la base de datos
        reservaRepository.guardarReserva(reserva);

        // Notificar al usuario
        notificacionService.EnviarNotificacion(usuario.getEmail(),
                "Confirmación de reserva: " + habitacion.getNombre() + " a nombre de: " + usuario.getNombre());
    }
}
