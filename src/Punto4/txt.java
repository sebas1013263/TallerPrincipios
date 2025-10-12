package Punto4;

public class txt implements Archivo{
    @Override
    public void CargarArchivo(String ruta) {
        System.out.println("Cargando archivo txt desde: "+ruta);
    }

    @Override
    public void GuardarArchivo(String contenido) {
        System.out.println( "Guardando archivo txt : "+contenido);
    }
}
