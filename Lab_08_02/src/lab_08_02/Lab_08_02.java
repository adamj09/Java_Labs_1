package lab_08_02;

import java.util.Scanner;

public class Lab_08_02 {
    public static void main(String[] args) {
        //System.out.println("Random number (excluding 5, 6, and 8): " + getRandom(5, 6, 8)); // Question 1
        //gcdTest();
        //eliminateDuplicatesTest();
        //equalsTest();

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
        System.out.print("Enter 5 integers: ");
        
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.printf("The GCD of these integers is: %d", gcd(numbers));
    } // end of gcdTest method

    public static int[] eliminateDuplicates(int[] numbers){
        int[] uniqueNumbers = new int[numbers.length];

        for(int i = 0, j = 0; i < numbers.length; i++){ // store the unique numbers in an array
            boolean containsNum = false; // check if number is already present in unique numbers
            for(int number : uniqueNumbers){
                if(number == numbers[i]){ 
                    containsNum = true;
                }
            }

            if(!containsNum){ // if number isn't present, add to unique numbers
                uniqueNumbers[j] = numbers[i];
                j++;
            }
        }

        // Trim trailing zeros (leave 1 zero if there's a zero as an input number)
        boolean containsZero = false;
        for(int number : numbers){
            if(number == 0){ 
                containsZero = true;
            }
        }
        int newLength = uniqueNumbers.length;
        while(uniqueNumbers[newLength - 1] == 0 && !containsZero){ 
            newLength--;
        }
        int[] trimmedUnique = new int[newLength];
        System.arraycopy(uniqueNumbers, 0, trimmedUnique, 0, newLength);

        return trimmedUnique;
    } // end of eliminateDuplicates method

    public static void eliminateDuplicatesTest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int[] uniqueNumbers = eliminateDuplicates(numbers);

        // print unique numbers
        System.out.print("\nThe unique numbers are: ");
        for(int i = 0; i < uniqueNumbers.length; i++){
            System.out.print(uniqueNumbers[i] + " ");
        }
    } // end of eliminateDuplicatesTest method

    public static boolean equals(int[] array1, int[] array2){
        if(array1.length != array2.length){ // first check if arrays are same length
            return false;
        }

        for(int i = 0; i < array1.length; i++){ // then check if contents of each array are same
            if(array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    } // end of equals method

    public static void equalsTest(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of both arrays: ");
        int arrayLength = input.nextInt(); // length for both arrays

        System.out.print("\nEnter array 1: "); // get first array from user
        int[] array1 = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array1[i] = input.nextInt();
        }

        System.out.print("\nEnter array 2: "); // get second array from user
        int[] array2 = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array2[i] = input.nextInt();
        }
        
        System.out.print("\n" + (equals(array1, array2) ? "These arrays are identical." : "These arrays are not identical."));
    } // end of equalsTest method

    
}