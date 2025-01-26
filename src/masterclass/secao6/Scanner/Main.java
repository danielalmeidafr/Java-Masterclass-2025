package masterclass.secao6.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dataAtual = 2024;


            System.out.println(getInputFromScanner(dataAtual));


    }

//    public static String getInputFromConsole(int dataAtual){
//
//        String name = System.console().readLine("Olá, qual seu nome?");
//        System.out.println("Olá, " + name + ". Continue estudando!");
//
//        String dataNasc = System.console().readLine("Em que ano você nasceu?");
//        int idade = dataAtual - Integer.parseInt(dataNasc);
//
//        return "Entao você tem " + idade + " anos.";
//    }

    public static String getInputFromScanner(int dataAtual){

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + ", em que ano você nasceu?");

        boolean validarDataAni = false;
        int idade = 0;

        do {
            System.out.println("O ano em que nasceu deve ser entre " + (dataAtual - 117) + " e " + dataAtual);
            try{
                idade = checkData(dataAtual, sc.nextLine());
                validarDataAni = idade < 0 ? false : true;
            } catch (NumberFormatException idadeErrada){
                System.out.println("Caracteres nao permitidos! Tente novamente.");
            }

        } while (!validarDataAni);


        return "Voce tem " + idade + " anos.";


    }

    public static int checkData(int dataAtual, String dataAniversario){
        int dataAni = Integer.parseInt(dataAniversario);
        int anoMinimo = dataAtual - 117;

        if (dataAni < anoMinimo || dataAni > dataAtual){
            return -1;
        }

        return dataAtual - dataAni;
    }
}
