package masterclass.topic7.Constructors.ConstructorsChallenges;

public class Customer {

    private String name;
    private String email;
    private double creditLimit;

    public Customer() {
        this("Default name", "Default address", 0.0);
    }

    public Customer(String name, String email) {
        this(name, email, 0.0);
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public void printCustomer(){
        System.out.println("Name: " + this.name + "\nEmail: " + this.email + "\nCredit limit: " + this.creditLimit);
        System.out.println("---------------------");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
