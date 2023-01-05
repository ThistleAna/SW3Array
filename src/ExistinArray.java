import java.util.Scanner;

public class ExistinArray {
    public static void main(String[] args) {
        //create Scanner object
        Scanner scanner = new Scanner(System.in);
        //create and initialise array, length is 5, assign 5 numbers
        // example : 12, 45, 67, 14, 90
        int[] numbers = {12, 45, 67, 14, 90};
        //ask the user to enter a value, assign this to userNumber variable
        System.out.print("Enter a value to search for: ");
        int userNumber = scanner.nextInt();
        // declare a new variable called valueFind, assign to 0 (int) or False (boolean)
        boolean valueFind = false;
        // use for loop to compare the userNumber with array element
        for (int i = 0; i < numbers.length; i++) {
            if (userNumber == numbers[i])
                valueFind = true;
        }

        // print the result, if valueFind is true "The number exist in array"
        if (valueFind) {
            System.out.println("Value " + userNumber + " found in array");
        } else {
            System.out.println("Value was not found in array");
        }
    }
}
