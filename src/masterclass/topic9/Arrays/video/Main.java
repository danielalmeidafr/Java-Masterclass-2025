package masterclass.topic9.Arrays.video;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5d;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] tenNumbersMultipliedBy2 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int i = 0; i < tenNumbersMultipliedBy2.length; i++){
            tenNumbersMultipliedBy2[i] *= 2;
        }
        for (int elementMultiplied : tenNumbersMultipliedBy2){
            System.out.print(elementMultiplied + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(tenNumbersMultipliedBy2));

    }
}
