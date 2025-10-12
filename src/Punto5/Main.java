package Punto5;

public class Main {
    public static void main(String[] args) {
        ReproductorMusica mp3 = new mp3();
        mp3.encender();
        mp3.apagar();
        mp3.reproducirMusica();
        System.out.println("-------------------------------");
        ReproductorVideo video = new objetoVideo();
        video.encender();
        video.apagar();
        video.reproducirMusica();
        video.reproducirVideo();
    }
}
