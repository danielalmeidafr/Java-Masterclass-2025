package masterclass.topic8.Polymorphism.PolymorphismChallenges;

public class CarroGas extends Car {

    private double kmRodado;
    private int qntdGas;

    public CarroGas(String description, double kmRodado, int qntdGas) {
        super(description);
        this.kmRodado = kmRodado;
        this.qntdGas = qntdGas;
    }

    public void abastecerCarroGas(int qntdAbastecida){
        if (qntdGas >= 100){
            System.out.println("Impossivel abastecer. Gás cheio.");
            return;
        }

        System.out.println("Abastecendo carro...");
        this.qntdGas += qntdAbastecida;
        if (this.qntdGas >= 100){
            this.qntdGas = 100;
        }

        System.out.println("Carro abastecido!");
        System.out.println("Nivel de gás: " + this.qntdGas);
    }

    @Override
    public void ligarMotor() {



        if (this.qntdGas <= 0){
            System.out.println("Sem gás para ligar o carro. Abasteça se possivel.");
            return;
        }

        System.out.println("Ligando o carro...");
    }

    @Override
    public void dirigir() {
        motor();
    }

    @Override
    protected void motor() {


        int gasPerdido;
        if (kmRodado < 33){
            gasPerdido = 30;
        } else if (kmRodado > 66){
            gasPerdido = 60;
        } else {
            gasPerdido = 40;
        }

        System.out.print("Dirigiu " + kmRodado + " km e perdeu ");

        if (gasPerdido > qntdGas){
            System.out.println(qntdGas + " de gás. O carro deligou!");
            return;
        } else {
            System.out.println(gasPerdido + " de gás.");
        }

        this.qntdGas -= gasPerdido;

        System.out.println("Nivel de gás restante: " + this.qntdGas);
    }
}

