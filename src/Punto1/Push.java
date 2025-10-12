package Punto1;

public class Push implements Notificador {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Mensaje push: "+mensaje);
    }
}
