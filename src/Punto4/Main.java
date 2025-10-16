package Punto4;

public class Main {
    public static void main(String[] args) {
        Archivo txt =new txt();
        Archivo pdf =new pdf();

        GestorArchivos gestorTxt=new GestorArchivos(txt);
        GestorArchivos gestorPdf=new GestorArchivos(pdf);

        gestorTxt.CargarArchivo("ruta.txt");
        gestorPdf.CargarArchivo("ruta.pdf");
        System.out.println("----------------------------------------");
        gestorPdf.guardarArchivo("contenido ejemplo.pdf");
        gestorTxt.guardarArchivo("contenido ejemplo.txt");
    }
}
