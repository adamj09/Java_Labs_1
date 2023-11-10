package lab5.pkg2;

import java.util.Scanner;

public class Lab52 {
    public static void main(String[] args) {
        //smallestNumber();
        //largestNumber();
        smallestFactorsOfInteger();
        //patternA();
        //patternB();
        //patternC();
        //patternD();
        //pyramidPattern();
        //reverseString();
    }
    
    public static void smallestNumber(){
        int smallestNumber = 0;
        while (Math.pow(smallestNumber, 2) < 12000){
            smallestNumber++;
        }
        System.out.println("Smallest n such that n^2 > 12,000: " + smallestNumber);
    } // End of smallestNumber method
    
    public static void largestNumber(){
        int largestNumber = 0;
        while (Math.pow(largestNumber + 1, 3) < 12000){
            largestNumber++;
        }
        System.out.println("Largest n such that n^2 < 12,000: " + largestNumber);
    } // End of largestNumber method
    
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
    
    public static void patternA(){
        final int NUM_ROWS = 6;
        for(int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++){
            for(int number = 1; number <= rowIndex + 1; number++){
                System.out.print(number + " ");
            }
            System.out.print('\n');
        }
    } // End of patternA method
    
    public static void patternB(){
        final int NUM_ROWS = 6;
        for(int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++){
            for(int number = 1; number < (NUM_ROWS - rowIndex + 1); number++){
                System.out.print(number + " ");
            }
            System.out.print('\n');
        }
    } // End of patternB method
    
    public static void patternC(){
        final int NUM_ROWS = 6;
        for(int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++){
            // Print required spaces
            for(int spaceIndex = 0; spaceIndex < ((NUM_ROWS - rowIndex) - 1) * 2; spaceIndex++){
                System.out.print(' ');
            }
            // Print numbers after spaces
            for(int number = rowIndex + 1; number >= 1; number--){
                System.out.print(number + " ");
            }
            System.out.print('\n');
        }
    } // End of patternC method
    
    public static void patternD(){
        final int NUM_ROWS = 6;
        for(int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++){
            // Print required spaces
            for(int spaceIndex = 0; spaceIndex < (rowIndex * 2); spaceIndex++){
                System.out.print(' ');
            }
            // Print numbers after spaces
            for(int number = 1; number <= NUM_ROWS - rowIndex; number++){
                System.out.print(number + " ");
            }
            System.out.print('\n');
        }
    } // End of patternD method
    
    public static void pyramidPattern(){
        final int NUM_ROWS = 8;
        final int MAX_NUM_DIGITS = (Math.pow(2, NUM_ROWS - 1) + "").length();
        
        for(int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++){
            // Spaces before row begins
            for(int spaceIndex = 0; spaceIndex < (NUM_ROWS * (MAX_NUM_DIGITS + 1)) - (rowIndex * (MAX_NUM_DIGITS + 1)); spaceIndex++){
                System.out.print(' ');
            }
            
            int numIndex;
            
            // First half of row
            for(numIndex = 0; numIndex < rowIndex; numIndex++){
                System.out.print((int)Math.pow(2, numIndex));
                
                // Spaces after each number
                for(int numSpaces = 0; numSpaces < (MAX_NUM_DIGITS + 1) - ((int)Math.pow(2, numIndex + 1) + "").length(); numSpaces++){
                    System.out.print(' ');
                }
            }
            
            // Second half of row
            for(numIndex = rowIndex; numIndex >= 0; numIndex--){
                System.out.print((int)Math.pow(2, numIndex));
                
                // Spaces after each number
                for(int numSpaces = 0; numSpaces < (MAX_NUM_DIGITS + 1) - ((int)Math.pow(2, numIndex - 1) + "").length(); numSpaces++){
                    System.out.print(' ');
                }
            }   
            System.out.print('\n');
        }
    } // End of pyramidPattern method
    
    public static void reverseString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to be reversed: ");
        String string = input.nextLine();
        
        String reversedString = ""; // Init empty string to start
        for(int index = string.length() - 1; index >= 0; index--){
            reversedString += string.charAt(index); // Add characters from input string starting from the last
        }
        
        System.out.printf("The reversed string: %s\n", reversedString);
    } // End of reverseString method
}
