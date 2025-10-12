package Punto3;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private List<Tareas> tareas;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tareas tarea) {
        tareas.add(tarea);
    }

    public void realizarTareas() {
        System.out.println("Empleado " + nombre + " realizando tareas:");
        for (Tareas t : tareas) {
            t.Realizartarea();
        }
        System.out.println();
    }
}

