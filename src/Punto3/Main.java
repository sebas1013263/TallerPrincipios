package Punto3;

public class Main {
    public static void main(String[] args) {
        // Crear tareas
        Tareas atender = new Atender();
        Tareas cocinar = new Cocinar();
        Tareas cobrar = new Cobrar();

        Empleado empleado1 = new Empleado("Juan");

        empleado1.agregarTarea(atender);
        empleado1.agregarTarea(cocinar);
        empleado1.agregarTarea(cobrar);

        empleado1.realizarTareas();

    }
}

