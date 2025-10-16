package Punto8;

public class FileLogger implements Logger {

    @Override
    public void debug(String message) {
        System.out.println("FileLogger DEBUG: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("FileLogger ERROR: " + message);
    }
}
