package masterclass.secao6.While;

public class WhileSumChallenge {
    public static void main(String[] args) {

        System.out.println(somaDigitos(5));
        reverse(234);
        System.out.println(getDigitCount(100));
    }

    public static int somaDigitos(int numero) {
        int soma = 0;

        if (numero < 0) {
            return -1;
        }

        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }

        return soma;
    }

    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }



        while (number > 0){
            int lastDigit = number % 10;
            number /= 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        }
    }

    public static void reverse(int number){
        numberToWords(number);
    }

    public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }

        int count = 0;
        while (number > 0){
            int lastDigit = number % 10;
            number /= 10;
            count++;
        }

        return count;
    }
}


