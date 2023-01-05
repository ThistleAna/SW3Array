public class SumAvgArray {
    public static void main(String[] args) {
        //create integer variable called sum, set to 0
        int sum = 0;
        //create int array of size 10, name this array numbers, put ten numbers inside this array
        int [] numbers = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // arrayName [index]
        /* use for loop  or for each loop to call the array and add them together
        save it inside sum variable
         */
        for ( int i : numbers) {
            System.out.println(i);
            sum += i;
        }


        // print the sum
        System.out.println("Sum of the numbers is " + sum);

        // calculate the average and print the average in double variable
        double average = (double) sum / numbers.length;

        System.out.println("The average is " + average);

    }
}
