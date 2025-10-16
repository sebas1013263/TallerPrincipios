package Punto8;

public class DatabaseLogger implements Logger{

    @Override
    public void debug(String message) {
        System.out.println("DatabaseLogger DEBUG: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("DatabaseLogger ERROR: " + message);
    }
}
