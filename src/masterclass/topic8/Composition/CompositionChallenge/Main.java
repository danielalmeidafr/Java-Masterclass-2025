package masterclass.topic8.Composition.CompositionChallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();

    }
}
