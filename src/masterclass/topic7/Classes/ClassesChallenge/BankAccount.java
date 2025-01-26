package masterclass.topic7.Classes.ClassesChallenge;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public void depositFunds(double value){
        this.balance += value;
        System.out.println("Deposit of R$" + value + " made. Your new balance is R$" + this.balance);
    }

    public void withdrawFunds(double value){
        if (value > balance){
            System.out.println("Insufficient funds! You tried to withdrawal R$" + value + ", but you only have R$" + this.balance + " in your account.");
            return;
        }

        this.balance -= value;
        System.out.println("Withdrawal of R$" + value + " made. Your new balance is R$" + this.balance);

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
