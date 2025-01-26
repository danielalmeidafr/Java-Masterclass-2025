package masterclass.topic9.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja escolher?");
        int qtdNumeros = sc.nextInt();
        sc.nextLine();

        int[] arrayNumeros = new int[qtdNumeros];

        for (int i = 0; i < arrayNumeros.length; i++){
            System.out.print("Escreva um número: ");
            int numEscolhido = sc.nextInt();
            sc.nextLine();

            arrayNumeros[i] = numEscolhido;
        }

        Arrays.sort(arrayNumeros);

        System.out.println("Números escolhidos: ");
        System.out.println(Arrays.toString(arrayNumeros));

        System.out.println("Menor valor escolhido: ");
        System.out.println(arrayNumeros[0]);

        System.out.println("Array reverso");
        reverseArray(arrayNumeros);
    }

    public static void reverseArray(int[] array){
        int lengthArray = array.length;
        int[] sortRandomNumber = new int[lengthArray];

        for (int i = 0; i < lengthArray; i++){
            sortRandomNumber[i] = array[lengthArray - 1 - i];
        }

        for (int i = 0; i < lengthArray; i++){
            array[i] = sortRandomNumber[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
