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

        //displaySortedNumbers(); // 10 6.2 question 5
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
            if(index == hexDigits.length){
                System.out.println("Invalid input; must be a valid hexadecimal digit.");
                continue;
            }
            break;
        } while(true);

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
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        if(number <= 0){ // Make sure the input is a positive number
            System.out.println("Invalid input: must enter an integer greater than 0!");
        }
        else{
            String message = "The smallest factors of " + number + ": ";
            
            int factor = 2, factorCount = 0;
            while(factor <= number){ // Stop when factor is equal to number
                if(number % factor == 0){ // Check if it's a factor and add to list if so
                    if(factorCount > 0){ // Comma and space before each number (except for the first)
                        message += ", ";
                    }
                    number /= factor; // Divide number by the factor (for next iteration)
                    message += factor;
                    factorCount++;
                }
                else{
                    factor++; // If the number is not a factor, skip it
                }
            }
            
            if(factorCount == 1){ // The input is a prime number
                System.out.println("This is a prime number; it has no factors other than 1 and itself.");
            }
            else{ // Print factors found from input
                System.out.println(message);
            }
        }
    } // End of factorsOfInteger method

    public static void smallestFactorsOfIntegerFor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        if(number <= 0){ // Make sure the input is a positive number
            System.out.println("Invalid input: must enter an integer greater than 0!");
        }
        else{
            String message = "The smallest factors of " + number + ": ";
            
            int factorCount = 0;
            for(int factor = 2; factor <= number;){ // Stop when factor is equal to number
                if(number % factor == 0){ // Check if it's a factor and add to list if so
                    if(factorCount > 0){ // Comma and space before each number (except for the first)
                        message += ", ";
                    }
                    number /= factor; // Divide number by the factor (for next iteration)
                    message += factor;
                    factorCount++;
                }
                else{
                    factor++; // If the number is not a factor, skip it
                }
            }
            
            if(factorCount == 1){ // The input is a prime number
                System.out.println("This is a prime number; it has no factors other than 1 and itself.");
            }
            else{ // Print factors found from input
                System.out.println(message);
            }
        }
    } // End of smallestFactorsOfIntegerFor method

    public static void smallestFactorsOfIntegerDoWhile(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        if(number <= 0){ // Make sure the input is a positive number
            System.out.println("Invalid input: must enter an integer greater than 0!");
        }
        else{
            String message = "The smallest factors of " + number + ": ";
            
            int factor = 2, factorCount = 0;
            do { // Stop when factor is equal to number
                if(number % factor == 0){ // Check if it's a factor and add to list if so
                    if(factorCount > 0){ // Comma and space before each number (except for the first)
                        message += ", ";
                    }
                    number /= factor; // Divide number by the factor (for next iteration)
                    message += factor;
                    factorCount++;
                }
                else{
                    factor++; // If the number is not a factor, skip it
                }
            }
            while(factor <= number);
            
            if(factorCount == 1){ // The input is a prime number
                System.out.println("This is a prime number; it has no factors other than 1 and itself.");
            }
            else{ // Print factors found from input
                System.out.println(message);
            }
        }
    } // End of smallestFactorsOfIntegerDoWhile method

    public static void displaySortedNumbers(double num1, double num2, double num3){
        // 6 possibilities
        if(num1 >= num2 && num1 >= num3){ // num1 is greatest
            if(num2 >= num3){
                System.out.println(num3 + " " + num2 + " " + num1); // num3 is least
            }
            else if(num3 > num2){
                System.out.println(num2 + " " + num3 + " " + num1); // num2 is least
            }
        }
        else if(num1 < num2 && num1 < num3){ // num 1 is the least
            if(num2 >= num3){
                System.out.println(num1 + " " + num3 + " " + num2); // num2 is the greatest
            }
            else if(num3 > num2){
                System.out.println(num1 + " " + num2 + " " + num3); // num3 is the greatest
            }
        }
        else if(num1 <= num2 && num1 >= num3){ // num 1 is between num3 and num2
            System.out.println(num3 + " " + num1 + " " + num2);
        }
        else { // num 1 is between num2 and num3          
            System.out.println(num2 + " " + num1 + " " + num3);
        }
    } // End of displaySortedNumbers method
}