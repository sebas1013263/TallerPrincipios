package Punto4;

public class GestorArchivos {
    private Archivo archivo;

    public GestorArchivos(Archivo archivo) {
        this.archivo = archivo;
    }
    public void guardarArchivo(String contenido){
        archivo.GuardarArchivo(contenido);
    }
    public void CargarArchivo(String ruta){
        archivo.CargarArchivo(ruta);
    }
}
