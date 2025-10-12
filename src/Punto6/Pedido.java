package Punto6;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    // Mover la responsabilidad aquí (Experto en la información)
    public double calcularTotal() {
        double total = 0;
        for (Item i : items) {
            total += i.getPrecio() * i.getCantidad();
        }
        return total;
    }
}
