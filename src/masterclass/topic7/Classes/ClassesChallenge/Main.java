package masterclass.topic7.Classes.ClassesChallenge;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("123456", 1000.00, "Daniel Alves", "d.almeidafrr@gmail.com", "(11) 965762340");

        bankAccount.depositFunds(250);
        bankAccount.withdrawFunds(300);
        bankAccount.withdrawFunds(960);
    }
}
