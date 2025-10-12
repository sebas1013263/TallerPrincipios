package Punto4;

public class docx implements Archivo{
    @Override
    public void CargarArchivo(String ruta) {
        System.out.println("Cargando archivo docx desde: "+ruta);
    }

    @Override
    public void GuardarArchivo(String contenido) {
        System.out.println("Guardando archivo docx: "+contenido);
    }
}
