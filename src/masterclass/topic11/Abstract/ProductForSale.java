package masterclass.topic11.Abstract;

public abstract class ProductForSale {

    private String description;
    private double price;
    private String type;

    public ProductForSale(String description, Double price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public double getSalesPrice(int quantity){
        return this.price * quantity;
    }

    public void printPricedItem(int quantity){
        System.out.println("--------------");
        System.out.println("Tipo do produto: " + type);
        System.out.println("Preço base do produto: " + price);
        System.out.println("Quantidade: " + quantity);
        System.out.println("Valor total: " + getSalesPrice(quantity));
    }

    public abstract void showDetails();

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}


