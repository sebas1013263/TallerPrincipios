package Punto5;

public class mp3 implements ReproductorMusica{
    @Override
    public void reproducirMusica() {
        System.out.println("reproduciendo musica");
    }

    @Override
    public void encender() {
        System.out.println("prendido");
    }

    @Override
    public void apagar() {
        System.out.println("apagando");
    }
}
