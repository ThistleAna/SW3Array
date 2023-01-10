// WB2 Array Part 2
import java.util.Random;
public class MaxandMin {
    public static void main(String[] args) {
        // create array of size 10, name this array myArray
        int[] myArray = new int[10];
        // create random object/instance, import random function/class
        Random rand = new Random();

        // generating random values, put it iside index i
        for(int i =0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(10) + 1;
            System.out.println("Print my array: "+ myArray[i]);
        }

        int maxValue = myArray[0];
        int minValue = myArray[0];

        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxValue) // find the biggest
                maxValue = myArray[i];


            if (myArray[i] < minValue) // find the smallest
                minValue = myArray[i];
        }

        System.out.println("The maximum value found is " + maxValue);
        System.out.println("The minimum value found is " + minValue);
    }
}
