package masterclass.secao6.Switch;

public class SwitchChallenge {
    public static void main(String[] args) {
        char letra = 'Z';

        switch(letra){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("A letra " + letra + " nao foi encontrada.");
        }
    }
}
