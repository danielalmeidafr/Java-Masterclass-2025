package masterclass.secao6.While;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Instrução for");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println();

//        System.out.println("Instrução while");
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//        } while (isReady);

        int numero = 0;
        while (numero < 50){
            numero += 5;
            if (numero % 25 == 0){
                continue;
            }
            System.out.print(numero + "_");
        }

    }
}
