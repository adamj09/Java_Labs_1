package lab_06_01;

import java.util.Scanner;

public class Lab_06_01 {
    public static void main(String[] args) {
        // Problem 1
        reverseStringWhile();
        reverseStringDoWhile();
        
        // Problem 2
        //smallestNumberFor();
        //largestNumberFor();
        //smallestNumberDoWhile();
        //largestNumberDoWhile();

        // Problem 3
        //smallestFactorsOfIntegerFor();
        //smallestFactorsOfIntegerDoWhile();

        // Problem 4
        //countSignsAndAverageFor();
        //countSignsAndAverageDoWhile();

        // Problem 5
        //computeFutureTuitionFor();
        //computeFutureTuitionDoWhile();
    }

    public static void reverseStringWhile(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to be reversed: ");
        String string = input.nextLine();
        
        String reversedString = ""; // Init empty string to start
        int index = string.length() - 1;
        while(index >= 0){
            reversedString += string.charAt(index); // Add characters from input string starting from the last
            index--;
        }
        
        System.out.printf("The reversed string: %s\n", reversedString);
    } // End of reverseStringWhile method

    public static void reverseStringDoWhile(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to be reversed: ");
        String string = input.nextLine();
        
        String reversedString = ""; // Init empty string to start
        int index = string.length() - 1;

        do{
            reversedString += string.charAt(index); // Add characters from input string starting from the last
            index--;
        }
        while(index >= 0);
        
        System.out.printf("The reversed string: %s\n", reversedString);
    } // End of reverseStringDoWhile method

    public static void smallestNumberFor(){
        int smallestNumber;
        for(smallestNumber = 0; Math.pow(smallestNumber, 2) < 12000; smallestNumber++);
        System.out.println("Smallest n such that n^2 > 12,000: " + smallestNumber);
    } // End of smallestNumberFor method

    public static void largestNumberFor(){
        int largestNumber;
        for (largestNumber = 0; Math.pow(largestNumber + 1, 3) < 12000; largestNumber++);
        System.out.println("Largest n such that n^2 < 12,000: " + largestNumber);
    } // End of largestNumberFor method

    public static void smallestNumberDoWhile(){
        int smallestNumber = 0;
        do{
            smallestNumber++;
        }
        while(Math.pow(smallestNumber, 2) < 12000);
        System.out.println("Smallest n such that n^2 > 12,000: " + smallestNumber);
    } // End of smallestNumberDoWhile method

    public static void largestNumberDoWhile(){
        int largestNumber = 0;
        do{
            largestNumber++;
        }
        while(Math.pow(largestNumber + 1, 3) < 12000);
        System.out.println("Largest n such that n^2 < 12,000: " + largestNumber);
    } // End of largestNumberDoWhile method

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

    public static void countSignsAndAverageFor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiple integers, 0 marks the end of the input: ");
        // Initial variables
        int numPositives = 0, numNegatives = 0, count = 0, total = 0;
        
        // Get each consecutive number and update necessary values
        for(int number = input.nextInt(); number != 0; number = input.nextInt()){
            count++;
            total += number;
            
            if(number > 0){
                numPositives++;
            }
            else{
                numNegatives++;
            }
        }
        
        if(count == 0){ // The user input 0 as their first number
            System.out.println("Invalid input: no integers.");
        }
        else{ // Output all the information collected from the loop above
            System.out.printf("Number of positives: %d\nNumber of negatives: %d\nSum of integers: %d\nAverage of integers: %.2f\n",
            numPositives, numNegatives, total, (double)total / (double)count);
        }
    } // End of countSignsAndAverageFor method

    public static void countSignsAndAverageDoWhile(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiple integers, 0 marks the end of the input: ");
        // Initial variables
        int number = input.nextInt(), numPositives = 0, numNegatives = 0, count = 0, total = 0;
        
        // Get each consecutive number and update necessary values
        do{
            if(number == 0) // Break out of loop if number is 0 (to prevent reading a first number that is 0)
                break;

            count++;
            total += number;
            
            if(number > 0){
                numPositives++;
            }
            else{
                numNegatives++;
            }
            
            number = input.nextInt();
        }
        while(number != 0);
        
        if(count == 0){ // The user input 0 as their first number
            System.out.println("Invalid input: no integers.");
        }
        else{ // Output all the information collected from the loop above
            System.out.printf("Number of positives: %d\nNumber of negatives: %d\nSum of integers: %d\nAverage of integers: %.2f\n",
            numPositives, numNegatives, total, (double)total / (double)count);
        }
    } // End of countSignsAndAverageDoWhile method

    public static void computeFutureTuitionFor(){
        double tuition = 10000.0;
        for(int years = 0; years < 10; years++){
            tuition *= 1.05; // increase tuition by %5 each year
        }
        
        System.out.printf("Tuition in 10 years: $%.2f\n", tuition);
        
        double year4Tuition = 0;
        for(int yearsAfter10Years = 0; yearsAfter10Years < 4; yearsAfter10Years++){
            year4Tuition += (tuition *= 1.05);
        }
        
        System.out.printf("Tuition cost for 4 years in 10 years: $%.2f\n", year4Tuition);
    } // End of computeFutureTuitionFor method

    public static void computeFutureTuitionDoWhile(){
        double tuition = 10000.0;
        int years = 0;
        
        do{
            tuition *= 1.05; // increase tuition by %5 each year
            years++;
        }
        while(years < 10);
        
        System.out.printf("Tuition in 10 years: $%.2f\n", tuition);
        
        double year4Tuition = 0;
        int yearsAfter10Years = 0;
        
        do{
            year4Tuition += (tuition *= 1.05);
            yearsAfter10Years++;
        }
        while(yearsAfter10Years < 4);
        
        System.out.printf("Tuition cost for 4 years in 10 years: $%.2f\n", year4Tuition);
    } // End of computeFutureTuitionDoWhile method
}