package lab2.pkg2;

import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) {
        //tableOfPowersWithLoop();
        //displayTimeWithMinutes();
        tableOfPowers();
        //futureInvestmentValue();
    } // End of main method
    
    public static void futureInvestmentValue(){
        // Get all the necessary values
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the initial investment amount ($): ");
        double initialAmount = input.nextDouble();
        
        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = input.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int numYears = input.nextInt();
       
        // Future value calculation (using the standard formula)
        double futureValue = initialAmount * Math.pow((1 + (annualInterestRate/100.0)), numYears);
        System.out.println("Future investment value: $" + futureValue);
    } // End of futureInvestmentValue method
    
    public static void tableOfPowers(){
        System.out.println(
            "a\tb\tpow(a,b)" +
            "\n1\t2\t" + (int)Math.pow(1, 2) +
            "\n2\t3\t" + (int)Math.pow(2, 3) +
            "\n3\t4\t" + (int)Math.pow(3, 4) +
            "\n4\t5\t" + (int)Math.pow(4, 5) +
            "\n5\t6\t" + (int)Math.pow(5, 6)
        );
    } // End of tableOfPowers method
    
    public static void tableOfPowersWithLoop(){
        final int NUM_ROWS = 6;
        System.out.println("a\tb\tpow(a,b)");
        for(int a = 1; a < NUM_ROWS; a++) // Iterate through each row
            System.out.println(a + "\t" + (a + 1) + "\t" + (int)Math.pow(a, a + 1)); // b = a + 1 here
    } // End of tableOfPowersWithLoop method
    
    public static void displayTimeWithMinutes(){
        final int MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24, DAYS_PER_YEAR = 365; // Define basic constants of time
        
        // Input the number of total minutes
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes (integer): ");
        int inputMinutes = input.nextInt();
        
        // Calculate what should be displayed for each unit of time
        int minutes = inputMinutes % MINUTES_PER_HOUR; // We use modulus here to get rid of the time already taken into account by greater units
        int hours = (inputMinutes / MINUTES_PER_HOUR) % HOURS_PER_DAY;
        int days = (inputMinutes / (HOURS_PER_DAY * MINUTES_PER_HOUR)) % DAYS_PER_YEAR;
        int years = (inputMinutes / (HOURS_PER_DAY * MINUTES_PER_HOUR * DAYS_PER_YEAR));
    
        System.out.println(inputMinutes + " minutes is " + years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes.");
    } // End of displayMinutes method
} // End of Lab22 class
