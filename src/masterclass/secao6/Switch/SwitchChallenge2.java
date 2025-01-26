package masterclass.secao6.Switch;

public class SwitchChallenge2 {
    public static void main(String[] args) {


        imprimeDiaDaSemana(0);
        imprimeDiaDaSemana(1);
        imprimeDiaDaSemana(2);
        imprimeDiaDaSemana(3);
        imprimeDiaDaSemana(4);
        imprimeDiaDaSemana(5);
        imprimeDiaDaSemana(6);
        imprimeDiaDaSemana(7);
    }

    public static void imprimeDiaDaSemana(int dia){

       String diaDaSemana = switch (dia) {
            case 0 -> "Domingo";
            case 1 -> "Segunda";
            case 2 -> "Terça";
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6 -> "Sábado";
            default ->"Dia inválido";
        };
        System.out.println(dia + " é " + diaDaSemana);
    }
}
