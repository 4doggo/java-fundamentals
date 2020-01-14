package basiclibrary;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.HashSet;

public class BasicLibrary {

    public static void main(String[] args) {

//        Test for rolling dice
        roll(10);
        System.out.println();

//        Test for checking for doubles
        int[] testArray = new int[]{1, 2, 3, 4, 10, 10, 11};
        containsDuplicates(testArray);
        System.out.println(containsDuplicates(testArray));


//        Test for average of array
        int[] testArray2 = new int[]{1,2,3,4,5,100};
        calculateAverage(testArray2);

    }

    public static double getRandomDouble() {

        int max = 6;
        int min = 1;

        double random = Math.random() * 6 + 1;
        double finalRandom = Math.floor(random);
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

    public static boolean containsDuplicates(int[] array) {

       for(int i =0; i < array.length; i++){
           for(int j =i+1; j < array.length; j++)
           if (array [i] == array [j]){
               System.out.println("This array has a duplicate!");
               return true;
           }
       }
       return false;
    }

    public static double calculateAverage(int[] array){
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];

        }
        average = (double)sum /array.length;
        return average;
    }

    public static String getMinAndMax(int[][] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> uniqueTemp = new HashSet<>();

        for(int i =0; i < array.length; i++) {
            for(int j =0; j < array[i].length; j++){

                uniqueTemp.add(array[i][j]);

                if (array[i][j] < min) {
                    min = array[i][j];
                }
                else if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }

        String resultHigh = "High: " + max + "\n Low:  " + min;

      for(int temperature = min; temperature <= max; temperature++ ){
          if (!uniqueTemp.contains(temperature)) {

          }
          }
      }

}
