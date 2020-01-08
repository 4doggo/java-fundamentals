package basiclibrary;
import java.lang.Math;

public class BasicLibrary {

    public static void main(String[] args) {

        roll(10);
        System.out.println();

    }

    public static double getRandomDouble() {

        int max = 6;
        int min = 1;

        double random = Math.random() * 6 + 1;
        double finalRandom = Math.floor(random);
        System.out.println(random);
        return finalRandom;
    }

    public static void roll(int n) {

        int rollCount = 0;


        while (rollCount < n) {
            double diceRoll = getRandomDouble();
                rollCount++;
            System.out.println(diceRoll);
        }

    }
}
