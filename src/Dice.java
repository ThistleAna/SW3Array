// how to use Random
import java.util.Random;

public class Dice{
    public static void main(String[] args) {
        // random instance/object
        Random randomGenerator = new Random();

        // variable to contain the dice number
        int diceNumber = randomGenerator.nextInt(6) + 1; // specify boundary

        System.out.println("The dice number is " + diceNumber);

        // extension : create new variable called crazyDice, boundary 1-10

    }
}
