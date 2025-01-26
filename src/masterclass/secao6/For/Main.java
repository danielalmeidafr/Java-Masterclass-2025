package masterclass.secao6.For;

public class Main {
    public static void main(String[] args) {

        for (double escalaJuros = 7.5; escalaJuros <= 10.0; escalaJuros += 0.25) {
            double juros =  calcularJuros(100.0, escalaJuros);
            if (juros > 8.50){
                break;
            }
            System.out.println("R$100,00 com " + escalaJuros + "% de juros = R$" + juros);
        }
    }

    public static double calcularJuros(double quantia, double escalaJuros) {
        return (quantia * (escalaJuros / 100));
    }
}
