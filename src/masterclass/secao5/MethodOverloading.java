package masterclass.secao5;


public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Nova pontuação é " + calcularPontuacao("Daniel", 500));
        System.out.println("Nova pontuação é " + calcularPontuacao(10));
    }

    public static int calcularPontuacao(String nomeJogador, int pontuacao){
        System.out.println("Jogador " + nomeJogador + " fez " + pontuacao + " pontos");
        return pontuacao * 1000;
    }

    public static int calcularPontuacao(int pontuacao){
        return calcularPontuacao("Anonimo", pontuacao);
    }

    public static int calcularPontuacao(){
        System.out.println("Jogador sem nome e sem pontuação.");
        return 0;
    }
}
