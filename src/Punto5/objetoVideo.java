package Punto5;

public class objetoVideo implements ReproductorVideo{
    @Override
    public void reproducirVideo() {
        System.out.println("reprodiciendo video");
    }

    @Override
    public void reproducirMusica() {
        System.out.println("reprodiciendo musica");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo");
    }

    @Override
    public void apagar() {
        System.out.println("apagando");
    }
}
