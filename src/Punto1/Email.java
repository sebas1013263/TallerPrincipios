package Punto1;

public class Email implements Notificador {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Mensaje Email: "+mensaje);
    }
}
