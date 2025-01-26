package masterclass.secao6.Scanner;

import java.util.Scanner;

public class MaxAndMinimumChallenge {
    public static void main(String[] args) {

        int maiorNumero = 0;
        int menorNumero = 0;
        int count = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva alguns numeros para saber qual é o menor e qual o maior (Digite uma letra se quiser sair)");

        while (true){
            System.out.println("Enter number #" + count);
            try {
                String nextNum = scanner.nextLine();
                int num = Integer.parseInt(nextNum);

                if (count == 1 || num < menorNumero){
                    menorNumero = num;
                }
                if (count == 1 || num > maiorNumero){
                    maiorNumero = num;
                }
                count++;

            } catch (NumberFormatException saidaInterface){
                System.out.println("Fim das escolhas.");
                break;
            }
        }

        if (count > 1){
            System.out.println("O maior numero digitado foi " + maiorNumero + " e o menor numero digitado foi " + menorNumero);

        } else {
            System.out.println("Nenhum valor inserido.");
        }

    }
}
