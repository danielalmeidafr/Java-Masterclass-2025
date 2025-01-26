package masterclass.topic7.Constructors.ConstructorsChallenges;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Daniel", "d.almeidafrr@gmail.com", 1000.0);
        Customer customer1 = new Customer("João", "joão@email.com");
        Customer customer2 = new Customer();

        customer.printCustomer();
        customer1.printCustomer();
        customer2.printCustomer();
    }
}
