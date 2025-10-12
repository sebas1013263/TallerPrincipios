package Punto6;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.addItem(new Item("Pan", 1500, 3));
        pedido.addItem(new Item("Leche", 2000, 2));
        pedido.addItem(new Item("Huevos", 300, 12));

        PedidoController controller = new PedidoController(pedido);
        double total = controller.obtenerTotalPedido();

        System.out.println("Total del pedido: $" + total);

    }
}

