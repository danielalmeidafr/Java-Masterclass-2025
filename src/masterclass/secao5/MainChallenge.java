package masterclass.secao5;

public class MainChallenge {
    public static void main(String[] args) {
        int pontuacaoMaxima = calcularPontuacao(true, 10000, 8, 200);
        System.out.println(pontuacaoMaxima);

        System.out.println("A poxima pontuacao maxima é " + calcularPontuacao(true, 800, 5, 100));
    }

    public static int calcularPontuacao(boolean gameOver, int pontuacao, int nivelCompletado, int bonus) {
        int pontuacaoFinal = pontuacao;

        if (gameOver) {
            pontuacaoFinal += (nivelCompletado * bonus);
        }

        return pontuacaoFinal;
    }
}
