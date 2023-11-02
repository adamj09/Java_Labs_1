package lab_08_02;

import java.util.Scanner;

public class Lab_08_02 {
    public static void main(String[] args) {
        //System.out.println("Random number (excluding 5, 6, and 8): " + getRandom(5, 6, 8)); // Question 1
        gcdTest();
    }

    public static int getRandom(int... excluded){
        boolean containsExcluded = false;
        int randNum;

        do {
            randNum = (int)(Math.random() * 54 + 1); // generate randNum

            for(int number : excluded){ // check if randNum is one of the excluded numbers
                if(randNum == number){
                    containsExcluded = true;
                    break;
                }
                containsExcluded = false;
            }
        } while(containsExcluded == true); // if randomNum is in list of excluded numbers, try again

        return randNum;
    } // end of getRandom method

    public static int gcd(int... numbers){
        if(numbers.length == 1){
            return numbers[0]; // return first number in list if only one number is given
        }

        // find the GCD of the first pair of numbers (we use abs so this works with negatives too)
        int gcd = Math.abs(Math.min(numbers[0], numbers[1]));
        while(numbers[0] % gcd != 0 || numbers[1] % gcd != 0){
            gcd--;
        }
        int previousGcd = gcd;

        for(int i = 2; i < numbers.length; i++){
            gcd = Math.abs(Math.min(previousGcd, numbers[i])); // init new start value for GCD
            while(previousGcd % gcd != 0 || numbers[i] % gcd != 0){ // find the GCD of the previous GCD and the next number
                gcd--;
            }

            if(gcd == 1){ // if GCD is 1, no point in continuing, so return GCD early
                return gcd;
            }
            previousGcd = gcd;
        }
        return gcd;
    } // end of gcd method

    public static void gcdTest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.printf("The GCD of these numbers is: %d", gcd(numbers));
    }
}