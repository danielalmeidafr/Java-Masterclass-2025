package masterclass.secao6.Switch;

public class Switch {
    public static void main(String[] args) {

        int valor = 3;

//        if (valor == 1){
//            System.out.println("Valor é 1");
//        } else if (valor == 2){
//            System.out.println("Valor é 2");
//        } else{
//            System.out.println("Valor não é 1 nem 2");
//        }

        switch (valor) {
            case 1 -> System.out.println("Valor é 1");
            case 2 -> System.out.println("Valor é 2");
            case 3, 4, 5 -> {
                System.out.println("Valor é 3, 4 ou 5");
                System.out.println("Na verdade o valor é " + valor);
            }
            default -> System.out.println("Não é 1, 2, 3, 4 ou 5");
        }

        String mes = "ABRIL";
        System.out.println(mes + " esta no " + getTrimestre(mes));
    }
    public static String getTrimestre(String mes){

        return switch (mes) {
            case "JANEIRO", "FEVEREIRO", "MARÇO" -> "primeiro tri";
            case "ABRIL", "MAIO", "JUNHO" -> "segundo tri";
            case "JULHO", "AGOSTO", "SETEMBRO" -> "terceiro tri";
            case "OUTUBRO", "NOVEMBRO", "DEZEMBRO" -> "quarto tri";
            default -> "mal";
        };
    }

}
