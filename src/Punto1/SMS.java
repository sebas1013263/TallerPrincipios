package Punto1;

public class SMS implements Notificador {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Mensaje SMS: "+mensaje);
    }
}
