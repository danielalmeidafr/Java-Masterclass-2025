package masterclass.secao6.Scanner;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 1;

        while (count <= 5){
             System.out.println("Enter number #" + count);
                String nextNumber = scanner.nextLine();
                try{
                    double number = Double.parseDouble(nextNumber);
                    count++;
                    sum += number;
                } catch (NumberFormatException errorFormatNumbert){
                    System.out.println("Invalid Number.");
                }
        }
        System.out.println("A soma dos numeros é " + sum);



//        for (int i = 1; i <= 5; i++){
//
//            System.out.println("Insira o numero #" + i);
//            String numero = scanner.nextLine();
//            try {
//                int num = Integer.parseInt(numero);
//                if (num < 0){
//                    System.out.println("Numero invalido");
//                    i -= 1;
//                    continue;
//                }
//                soma += num;
//            } catch (NumberFormatException errorFormatNumber){
//                i -= 1;
//                System.out.println("Numero invalido.");
//            }
//        }
    }
}
