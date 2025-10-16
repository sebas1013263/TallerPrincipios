package Punto8;

public class ConsoleLogger implements Logger {

    @Override
    public void debug(String message) {
        System.out.println("ConsoleLogger DEBUG: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("ConsoleLogger ERROR: " + message);
    }
}
