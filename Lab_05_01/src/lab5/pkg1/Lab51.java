package lab5.pkg1;

import java.util.Scanner;

public class Lab51 {
    public static void main(String[] args) {
        countSignsAndAverage();
        //milesToKilometersTable();
        //computeFutureTuition();
        //numbersDivisibleBy5or6();
        //pyramidOfNumbers();
    }
    
    public static void countSignsAndAverage(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiple integers, 0 marks the end of the input: ");
        // Initial variables
        int number = input.nextInt(), numPositives = 0, numNegatives = 0, count = 0, total = 0;
        
        // Get each consecutive number and update necessary values
        while(number != 0){
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
        
        if(count == 0){ // The user input 0 as their first number
            System.out.println("Invalid input: no integers.");
        }
        else{ // Output all the information collected from the loop above
            System.out.printf("Number of positives: %d\nNumber of negatives: %d\nSum of integers: %d\nAverage of integers: %.2f\n",
            numPositives, numNegatives, total, (double)total / (double)count);
        }
    } // End of countSignsAndAverage method
    
    public static void milesToKilometersTable(){
        System.out.println("Miles\tKilometers"); // Content titles
        int miles = 1;
        while (miles <= 10){
            System.out.printf("%d\t%.3f\n", miles, ((double)miles * 1.609)); // Convert mi to km and display
            miles++;
        }
    } // End of milesToKilometersTable method
    
    public static void computeFutureTuition(){
        double tuition = 10000.0;
        int years = 0;
        
        while(years < 10){
            tuition *= 1.05; // increase tuition by %5 each year
            years++;
        }
        
        System.out.printf("Tuition in 10 years: $%.2f\n", tuition);
        
        double year4Tuition = 0;
        int yearsAfter10Years = 0;
        
        while(yearsAfter10Years < 4){
            year4Tuition += (tuition *= 1.05);
            yearsAfter10Years++;
        }
        
        System.out.printf("Tuition cost for 4 years in 10 years: $%.2f\n", year4Tuition);
    } // End of computeFutureTuition method
    
    public static void numbersDivisibleBy5or6(){
        int indexInRow = 0, number = 0;
        while(number < 200){ // Can modify this limit to any positive number
            if(indexInRow == 10){ // Create a new row if the existing row has 10 entries (is full)
                System.out.print('\n');
                indexInRow = 0;
            }
            if(number % 5 == 0 ^ number % 6 == 0){ // Add entry to row
                System.out.printf("%d ", number);
                indexInRow++;
            }
            number++;
        }
        if(indexInRow != 0){ // If the last row has less than 10 entries, add a new line anyway to keep it clean
            System.out.print('\n');
        }
    } // End of numbersDivisible method
    
    public static void pyramidOfNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = input.nextInt();
        
        // Calculate half the length of the triangle's base (the largest row)
        int lengthBottomRow = 0, bottomRowNumber = numRows;
        while(bottomRowNumber > 1){
            lengthBottomRow += (bottomRowNumber + " ").length();
            bottomRowNumber--;
        }
        
        int rowIndex = 0;
        while(rowIndex < numRows){ // For each row, generate numbers and spaces
            // Calculate half the length of the current row
            int lengthCurrentRow = 0, num = rowIndex + 1;
            while(num > 1){
                lengthCurrentRow += (num + " ").length();
                num--;
            }
            
            // Calculate number of spaces required to create triangle shape (base of triangle - length of this row)
            int spaceIndex = 0;
            while(spaceIndex < lengthBottomRow - lengthCurrentRow){
                System.out.print(' ');
                spaceIndex++;
            }
            
            int numIndex = 0;
            while(numIndex < ((rowIndex + 1) * 2) + 1){ // Fill out pyramid row with numbers
                int currentNum = Math.abs((rowIndex + 1) - numIndex);
                
                if(currentNum == 1){ // Skip 0 and repeating 1
                    numIndex += 2;
                }
                
                System.out.print(currentNum + " "); // Add number to row
                numIndex++;
            }
            
            // Move to next row
            System.out.print('\n');
            rowIndex++;
        }
    } // End of pyramidOfNumbers method
}
