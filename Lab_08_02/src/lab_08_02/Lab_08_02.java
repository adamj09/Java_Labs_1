package lab_08_02;

import java.util.Scanner;

public class Lab_08_02 {
    public static void main(String[] args) {
        //System.out.println("Random number (excluding 5, 6, and 8): " + getRandom(5, 6, 8));
        System.out.println(gcd(8, 20));
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
        int gcd = Math.min(numbers[0], numbers[1]);

        // find the GDC of the first pair of numbers
        while(numbers[0] % gcd != 0 || numbers[1] % gcd != 0){
            gcd--;
        }

        int previousGcd = gcd;

        for(int i = 2; i < numbers.length; i++){ // find the GDC of the previous GDC and the next number
            gcd = Math.min(previousGcd, numbers[i]);
            while(previousGcd % gcd != 0 || numbers[i] % gcd != 0){
                gcd--;
            }

            if(gcd == 1){
                return gcd;
            }
            previousGcd = gcd;
        }
        return gcd;
    }
}