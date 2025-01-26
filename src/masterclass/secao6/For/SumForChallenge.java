package masterclass.secao6.For;

public class SumForChallenge {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; count < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("O número " + i + " é divido por 3 e 5.");
                count++;
                sum += i;
            }
        }
        System.out.println("A soma dos números dividos por 3 e 5 é " + sum);
    }
}
