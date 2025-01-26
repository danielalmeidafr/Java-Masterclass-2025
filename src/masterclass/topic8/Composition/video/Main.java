package masterclass.topic8.Composition.video;

public class Main {
    public static void main(String[] args) {

        // Componentes de um computador
        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2549 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // Computador com os componentes
        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherboard);

        personalComputer.powerUp();
    }
}
