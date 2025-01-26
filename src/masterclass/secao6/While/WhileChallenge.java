package masterclass.secao6.While;

public class WhileChallenge {
    public static void main(String[] args) {

        int numero = 4;
        int numeroPar = 0;
        int numeroImpar = 0;
        int contadorNumeroPar = 1;

        while (numero <= 20 && contadorNumeroPar < 6) {

            numero++;

            if (isEvenNumber(numero)) {
                numeroImpar++;
                continue;
            }

            System.out.println(numero + " é um numero par");
            numeroPar++;
            contadorNumeroPar++;
        }

        System.out.println("O numeros de pares entre 5 e 20 é " + numeroPar);
        System.out.println("O numeros de impares entre 5 e 20 é " + numeroImpar);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 != 0;
    }
}
