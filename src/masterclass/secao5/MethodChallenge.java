package masterclass.secao5;


public class MethodChallenge {
    public static void main(String[] args) {
        int posicaoPontuacaoMaxima = calcularPosicaoPontuacaoMaxima(1500);
        imprimePosicaoPontuacaoMaxima("Daniel", posicaoPontuacaoMaxima);

        int posicaoPontuacaoMaxima2 = calcularPosicaoPontuacaoMaxima(1000);
        imprimePosicaoPontuacaoMaxima("Bob", posicaoPontuacaoMaxima2);

        int posicaoPontuacaoMaxima3 = calcularPosicaoPontuacaoMaxima(500);
        imprimePosicaoPontuacaoMaxima("Percy", posicaoPontuacaoMaxima3);

        int posicaoPontuacaoMaxima4 = calcularPosicaoPontuacaoMaxima(100);
        imprimePosicaoPontuacaoMaxima("Gilbert", posicaoPontuacaoMaxima4);

        int posicaoPontuacaoMaxima5 = calcularPosicaoPontuacaoMaxima(25);
        imprimePosicaoPontuacaoMaxima("James", posicaoPontuacaoMaxima5);
    }
    public static void imprimePosicaoPontuacaoMaxima(String nomeJogador, int posicaoJogador){
        System.out.println(nomeJogador + " conseguiu chegar à posicao " + posicaoJogador + " na lista de pontuação máxima!");
    }

    public static int calcularPosicaoPontuacaoMaxima(double pontuacaoJogador){
        int posicao = 4;

        if (pontuacaoJogador >= 1000){
            posicao = 1;
        } else if (pontuacaoJogador >= 500) {
            posicao = 2;
        } else if (pontuacaoJogador >= 100) {
            posicao = 3;
        }
        return posicao;
    }
}
