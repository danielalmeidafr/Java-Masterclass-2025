package masterclass.topic7.Inheritance.InheritanceChallenges;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Daniel", "26/09/2007", "01/01/2024");
        System.out.println(employee1);
        System.out.println(employee1.getAge());
        System.out.println(employee1.collectPay());
        System.out.println();

        SalariedEmployee employee2 = new SalariedEmployee("Joao", "01/01/2008", "03/03/2024", 35000);
        System.out.println(employee2);
        System.out.println(employee2.getName() + "'s paycheck = R$" + employee2.collectPay());
        employee2.retire();
        System.out.println(employee2.getName() + "'s pension check = R$" + employee2.collectPay());
        System.out.println();

        HourlyEmployee employee3 = new HourlyEmployee("Davi", "08/06/2008", "03/03/2024", 15);
        System.out.println(employee3);
        System.out.println(employee3.getName() + "'s paycheck = R$" + employee3.collectPay());
        employee2.retire();
        System.out.println(employee3.getName() + "'s Holiday Pay = R$" + employee3.getDoublePay());
    }
}
