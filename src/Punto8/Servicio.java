package Punto8;

import java.util.List;

public class Servicio {

    private final List<Logger> loggers;
    public Servicio(List<Logger> loggers) {
        this.loggers = loggers;
    }

    public void ejecutarTarea() {
        try {
            for (Logger logger : loggers) {
                logger.debug("Tarea ejecutada correctamente.");
            }
        } catch (Exception e) {
            for (Logger logger : loggers) {
                logger.error("Error al ejecutar la tarea: " + e.getMessage());
            }
        }
    }
}
