package Punto8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Logger dbLogger = new DatabaseLogger();
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();

        Servicio servicio = new Servicio(Arrays.asList(dbLogger, fileLogger, consoleLogger));
        servicio.ejecutarTarea();
    }
}

