package masterclass.topic8.Polymorphism.PolymorphismChallenges;

public class CarroEletrico extends Car{

    private double kmRodado;
    private int qntdBateria;

    public CarroEletrico(String description, double avgKmPerCharge, int qntdBateria) {
        super(description);
        this.kmRodado = avgKmPerCharge;
        this.qntdBateria = qntdBateria;
    }

    public void recarregarCarroEletrico(int qntdRecarregada){

        if (qntdBateria >= 100){
            System.out.println("Impossivel recarregar. Bateria cheia.");
            return;
        }

        System.out.println("Recarregando carro...");
        this.qntdBateria += qntdRecarregada;
        if (this.qntdBateria >= 100){
            this.qntdBateria = 100;
        }

        System.out.println("Carro abastecido!");
        System.out.println("Nivel de gás: " + this.qntdBateria);
    }

    @Override
    public void ligarMotor() {

        if (this.qntdBateria <= 0){
            System.out.println("Sem bateria para ligar o carro. Recarregue se possivel.");
            return;
        }
        System.out.println("Ligando o carro...");
    }

    @Override
    public void dirigir() {
        ligarMotor();
        motor();
    }

    @Override
    protected void motor() {
        int bateriaPerdida;
        if (kmRodado < 33){
            bateriaPerdida = 30;
        } else if (kmRodado > 66){
            bateriaPerdida = 60;
        } else {
            bateriaPerdida = 40;
        }

        System.out.print("Dirigiu " + kmRodado + " km e perdeu ");

        if (qntdBateria < bateriaPerdida){

            bateriaPerdida = qntdBateria;
            System.out.print(bateriaPerdida + "% de carga. O carro deligou!");
        } else {

            System.out.println(bateriaPerdida + "% de carga.");
        }

        this.qntdBateria -= bateriaPerdida;


        System.out.println("Nivel de bateria restante: " + this.qntdBateria);
    }

}