package masterclass.topic11.Abstract;

public class Shoes extends ProductForSale{

    public Shoes(String description, Double price, String type) {
        super(description, price, type);
    }

    @Override
    public void showDetails() {
        System.out.println(getType() + " está a venda!!");
        System.out.println(getDescription());
        System.out.println("Adquira agora mesmo pelo valor de R$" + getPrice());
    }
}

