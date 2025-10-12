package Punto6;

public class PedidoController {

    private Pedido pedido;

    public PedidoController(Pedido pedido) {
        this.pedido = pedido;
    }

    public double obtenerTotalPedido() {
        return pedido.calcularTotal();
    }
}
