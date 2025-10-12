package Punto1;

public class Main {
    public static void main(String[] args) {
        Notificador SMS = new SMS();
        SMS.notificar("Hola carla");

        Notificador EMAIL = new Email();
        EMAIL.notificar("Hola sofia");

        Notificador PUSH = new Push();
        PUSH.notificar("Hola Sebastian");


    }
}
