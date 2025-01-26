package masterclass.topic9.Challenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Quantos numeros deseja sorter?");
        int lenNumbersRandoms = sc.nextInt();
        sc.nextLine();

        int[] randomNumber = new int[lenNumbersRandoms];
        int[] sortRandomNumber = new int[lenNumbersRandoms];

        for (int i = 0; i < lenNumbersRandoms; i++){
            randomNumber[i] = random.nextInt(1000);
        }
        int arrayLength = randomNumber.length;

        System.out.println("Lista de numeros sorteados:");
        System.out.println(Arrays.toString(randomNumber));

        System.out.println("Lista de numeros sorteados em ordem crescente:");
        Arrays.sort(randomNumber);
        System.out.println(Arrays.toString(randomNumber));

        System.out.println("Lista de numeros sorteado em ordem descrecente:");
        for (int i = 0; i < lenNumbersRandoms; i++){
            sortRandomNumber[i] = randomNumber[arrayLength - 1 - i];
        }
        System.out.println(Arrays.toString(sortRandomNumber));

    }
}
