package masterclass.secao5;


public class MethodOverloadingChallenge2 {
    public static void main(String[] args) {
        System.out.println(getDuracaoString(12506));
        System.out.println(getDuracaoString(65, 45));
        System.out.println(getDuracaoString(-102, 59));
    }

    public static String getDuracaoString(int segundos) {
        if (segundos < 0) {
            return "Dados inválidos para segundos(" + segundos
                    + "), precisa ser um valor inteiro positivo";
        }

        int minutos = segundos / 60;
        return getDuracaoString(minutos, segundos % 60);
    }

    public static String getDuracaoString(int minutos, int segundos) {

        if (minutos < 0) {
            return "Dados inválidos para minutos(" + minutos
                    + "), precisa ser um valor inteiro positivo";
        }

        if (segundos < 0 || segundos > 59) {
            return "Dados inválidos para segundos(" + segundos
                    + "), precisa ser um valor entre 0 e 59";
        }

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        return horas + "h " + minutosRestantes + "m " + segundos + "s";
    }
}
