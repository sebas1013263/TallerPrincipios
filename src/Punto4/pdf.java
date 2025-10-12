package Punto4;

public class pdf implements Archivo{

    @Override
    public void CargarArchivo(String ruta) {
        System.out.println("Cargando archivo PDF desde: "+ruta);
    }

    @Override
    public void GuardarArchivo(String contenido) {
        System.out.println("Guardando archivo PDF: "+contenido);
    }
}
