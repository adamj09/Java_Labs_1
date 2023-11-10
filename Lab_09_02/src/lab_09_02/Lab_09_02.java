package lab_09_02;

import java.util.Scanner;

public class Lab_09_02 {
    public static void main(String[] args) {
        //productOfDigitsInInteger(); // 1 2.1 question 4

        //tableOfPowers(); // 2 2.2 question 2

        //sortThreeIntegers(); // 3 3.1 question 4

        //lottery(); // 4 3.2 question 4

        //hexToBinary(); // 5 4.1 question 4

        //compareStringsTest(); // 6 4.2 question 2

        //countSignsAndAverage(); // 7 5.1 question 1

        //smallestFactorsOfInteger(); // 8 5.2 question 2

        //smallestFactorsOfIntegerFor(); // 9 6.1 question 3
        //smallestFactorsOfIntegerDoWhile(); // 9 6.1 question 3

        displaySortedNumbers(2, 3, 1); // 10 6.2 question 5
    }

    public static void productOfDigitsInInteger(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        int[] digits = new int[(num + "").length()];

        for(int i = 0; i < digits.length; i++){
            digits[i] = (num / (int)Math.pow(10, i)) % 10;
        }

        int product = digits[0];
        for(int i = 1; i < digits.length; i++){
            product *= digits[i];
        }
        
        System.out.println("Product of all digits: " + product);
    } // End of productOfDigitsInInteger method

    public static void tableOfPowers(){
        int[] aValues = new int[5];
        for(int i = 0; i < aValues.length; i++){
            aValues[i] = i;
        }

        System.out.println("a\tb\tpow(a, b)");
        for(int value : aValues){
            System.out.printf("%d\t%d\t%d\n", value, value + 1, (int)Math.pow(value, value + 1));
        }
    } // End of tableOfPowers method

    public static void sortThreeIntegers(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three integers to be sorted: ");
        int[] numbers = {input.nextInt(), input.nextInt(), input.nextInt()};
        
        for(int i = 0; i < numbers.length; i++){
            int minIndex = i;
            for(int j = i; j < numbers.length; j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }

        System.out.print("Sorted integers: ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
    } // End of sortThreeIntegers method

    public static void lottery(){
        final int DIGIT_COUNT = 4;
        // Get user's guess
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a %d-digit integer as your lottery number guess: ", DIGIT_COUNT);

        int guessNum;
        do{
            guessNum = input.nextInt();
            if((guessNum + "").length() == DIGIT_COUNT){
                break;
            }
            System.out.printf("Invalid guess, number must have %d digits. Guess again.\n", DIGIT_COUNT);
        } while(true);
        int winNum = (int)(Math.random() * (int)Math.pow(10, DIGIT_COUNT));

        // Extract Digits
        int[] guessDigits = new int[DIGIT_COUNT];
        int[] winDigits = new int[DIGIT_COUNT];
        for(int i = 0; i < guessDigits.length; i++){
            guessDigits[i] = (guessNum / (int)Math.pow(10, i)) % 10;
            winDigits[i] = (winNum / (int)Math.pow(10, i)) % 10;
        }

        // Check prize user won
        System.out.println("The winning number is: " + winNum);

        int count = 0;
        for(int i = 0; i < winDigits.length; i++){
            for(int j = 0; j < guessDigits.length; j++){
                if(winDigits[i] == guessDigits[j]){ // Check if all digits match all digits in the lottey number
                    count++;
                }
            }
        }

        if(guessNum == winNum){ // The guess matches exactly the lottery number
            System.out.println("You won $10,000!");
        }
        else if(count < DIGIT_COUNT && count > 0){
            System.out.println("You won $1,000!"); // if all digits match all digits in the lottey number (in no particular order)
        }
        else if(count >= DIGIT_COUNT){
            System.out.println("You won $3,000!"); // if digit matches a digit in the lottery number
        }
        else{
            System.out.println("You lost!");
        }
    } // End of lottery method

    public static void hexToBinary(){
        // Get hex digit from user
        Scanner input = new Scanner(System.in);

        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String[] binValues = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int index;

        do{
            System.out.print("Enter a hexidecimal digit: ");
            char hexDigit = Character.toUpperCase(input.nextLine().charAt(0));

            for(index = 0; index < hexDigits.length; index++){
                if(hexDigits[index] == hexDigit){
                    break;
                }
            }
            System.out.println("Invalid input; must be a valid hexadecimal digit.");
        } while(index == hexDigits.length);

        System.out.println("The corresponding binary value is: " + binValues[index]);
    } // End of hexToBinary method

    public static void compareStringsTest(){
        // Get two string from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of pairs of strings to compare: ");
        int pairs = input.nextInt();
        String[] strings = new String[pairs * 2];

        System.out.printf("Enter %d pairs of strings to compare: ", pairs);
        
        for(int i = 0; i < strings.length; i++){
            strings[i] = input.next();
        }

        // Test string methods
        for(int i = 0; i < strings.length - 1; i += 2){
            System.out.printf("\n\nPair %d: ", i / 2);
            System.out.printf("\nString %d: ", i);
            System.out.printf("\nis the same as string %d: " + strings[i].equals(strings[i + 1]), i + 1);
            System.out.printf("\nis the same as string %d, ignoring case: " + strings[i].equalsIgnoreCase(strings[i + 1]), i + 1);
            System.out.printf("\nis greater than or equal to string %d: " + (strings[i].compareTo(strings[i + 1]) >= 0), i + 1);
            System.out.printf("\nis greater than or equal to string %d, ignoring case: " + (strings[i].compareToIgnoreCase(strings[i + 1]) >= 0), i);
            System.out.printf("\nstarts with the same letter as string %d: " + strings[i].startsWith(strings[i + 1].charAt(0) + ""), i);
            System.out.printf("\nends with the same letter as string %d: " + strings[i].endsWith(strings[i + 1].charAt(strings[i + 1].length() - 1) + "\n"), i);
        }
    } // End of compareStringsTest method
    
    public static void countSignsAndAverage(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers to evaluate: ");
        int[] numbers = new int[input.nextInt()];

        System.out.print("Enter the integers to evaluate: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int positiveCount = 0, negativeCount = 0, sum = 0;
        for(int number : numbers){
            sum += number;
            
            if(number > 0){
                positiveCount++;
            }
            else{
                negativeCount++;
            }
        }
        
        // Output all the information collected from the loop above
        System.out.printf("Number of positives: %d\nNumber of negatives: %d\nSum of integers: %d\nAverage of integers: %.2f\n",
        positiveCount, negativeCount, sum, (double)sum / (double)numbers.length);
    } // End of countSignsAndAverage method

    public static void smallestFactorsOfInteger(){
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter an integer: ");
            if((number = input.nextInt()) > 0){
                break;
            }
            System.out.println("Invalid input: must enter an integer greater than 0!");
        } while(true);

        int[] factors = new int[number / 2];
        int originalNumber = number;
        int factor = 2, i = 0;
        while(i < factors.length && factor <= number){ // Stop when factor is equal to number
            if(number % factor == 0){ // Check if it's a factor and add to list if so
                number /= factor; // Divide number by the factor (for next iteration)
                factors[i] = factor;
                i++;
            }
            else{
                factor++; // Number is not a factor, so skip it
            }
        }

        if(factors[0] == 1){ // The input is a prime number
            System.out.println("This is a prime number; it has no factors other than 1 and itself.");
        }
        else{ // Print factors found from input
            System.out.print("Factors of " + originalNumber + ": ");
            for(int j = 0; j < factors.length && factors[j] != 0; j++){
                System.out.print(factors[j]);

                if(j < factors.length - 1){ // add comma after each factor except last
                    if(factors[j + 1] != 0){
                        System.out.print(", ");
                    }
                }
            }
        }
    } // End of factorsOfInteger method

    public static void smallestFactorsOfIntegerFor(){
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter an integer: ");
            if((number = input.nextInt()) > 0){
                break;
            }
            System.out.println("Invalid input: must enter an integer greater than 0!");
        } while(true);

        int[] factors = new int[number / 2];
        int originalNumber = number;
        for(int factor = 2, i = 0; i < factors.length && factor <= number;){ // Stop when factor is equal to number
            if(number % factor == 0){ // Check if it's a factor and add to list if so
                number /= factor; // Divide number by the factor (for next iteration)
                factors[i] = factor;
                i++;
            }
            else{
                factor++; // Number is not a factor, so skip it
            }
        }

        if(factors[0] == 1){ // The input is a prime number
            System.out.println("This is a prime number; it has no factors other than 1 and itself.");
        }
        else{ // Print factors found from input
            System.out.print("Factors of " + originalNumber + ": ");
            for(int i = 0; i < factors.length && factors[i] != 0; i++){
                System.out.print(factors[i]);

                if(i < factors.length - 1){ // add comma after each factor except last
                    if(factors[i + 1] != 0){
                        System.out.print(", ");
                    }
                }
            }
        }
    } // End of smallestFactorsOfIntegerFor method

    public static void smallestFactorsOfIntegerDoWhile(){
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter an integer: ");
            if((number = input.nextInt()) > 0){
                break;
            }
            System.out.println("Invalid input: must enter an integer greater than 0!");
        } while(true);

        int[] factors = new int[number / 2];
        int originalNumber = number;
        int factor = 2, i = 0;
        do{
            if(number % factor == 0){ // Check if it's a factor and add to list if so
                number /= factor; // Divide number by the factor (for next iteration)
                factors[i] = factor;
                i++;
            }
            else{
                factor++; // Number is not a factor, so skip it
            }
        } while(i < factors.length && factor <= number); // Stop when factor is equal to number

        if(factors[0] == 1){ // The input is a prime number
            System.out.println("This is a prime number; it has no factors other than 1 and itself.");
        }
        else{ // Print factors found from input
            System.out.print("Factors of " + originalNumber + ": ");
            for(int j = 0; i < factors.length && factors[j] != 0; j++){
                System.out.print(factors[j]);

                if(i < factors.length - 1){ // add comma after each factor except last
                    if(factors[j + 1] != 0){
                        System.out.print(", ");
                    }
                }
            }
        }
    } // End of smallestFactorsOfIntegerDoWhile method

    public static void displaySortedNumbers(double... numbers){
        double[] sorted = new double[numbers.length];

        System.out.println("Sorted numbers: ");
        for(int i = 0; i < numbers.length; i++){
            int minIndex = i;
            for(int j = i; j < numbers.length; j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            sorted[i] = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            System.out.print(sorted[i] + " ");
        }
    } // End of displaySortedNumbers method
}