package masterclass.secao6.For;

public class ForChallenge {
    public static void main(String[] args) {

//       for (int i = 2; i <= 1000; i++){
//           System.out.println(isPrimo(i));
//       }

        int count = 0;
        for (int i = 0; count < 3 && i <= 40; i++){
            if (isPrimo(i)){
                System.out.println("O número " + i + " é um número primo.");
                count++;
            }
        }

    }

    public static boolean isPrimo(int numero){

        if (numero <= 2){
            return numero == 2;
        }

        for (int divisor = 2; divisor <= numero / 2; divisor++){
            if (numero % divisor == 0){
                return false;
            }
        }
        return true;
    }

}