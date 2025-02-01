package masterclass.topic11.Abstract;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        //Lista de Itens
        List<OrderItem> orderItemsList =new ArrayList<>();

        // PRODUTOS
        ProductForSale product = new Television("60 polegadas da SAMSUNG", 1000.0, "Televisao");
        ProductForSale product2 = new Shoes("Air force 1", 800.0, "Tenis");

        // Instanciando
        OrderItem orderItem = new OrderItem(2, product);
        OrderItem orderItem2 = new OrderItem(10, product2);

        // Adicionando na lista
        orderItemsList.add(orderItem);
        orderItemsList.add(orderItem2);

        product.printPricedItem(orderItem.quantity());
        product.printPricedItem(orderItem2.quantity());
    }
}
