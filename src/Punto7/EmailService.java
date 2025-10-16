package Punto7;

public class EmailService implements NotificacionService {

    @Override
    public void EnviarNotificacion(String direccion, String mensaje) {
        System.out.println("Enviando Email a " + direccion + " : " + mensaje);
    }
}
