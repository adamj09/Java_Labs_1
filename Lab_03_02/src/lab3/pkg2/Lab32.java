package lab3.pkg2;

import java.util.Scanner;

public class Lab32 {
    public static void main(String[] args) {
        //findDaysInMonth();
        //palindromeInt();
        //determineShippingCost();
        //lottery();
        rockPaperScissors();
    }
    
    public static void findDaysInMonth(){
        // Get month and year from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired month and year respectively: ");
        int month = input.nextInt(), year = input.nextInt();
        
        // Print number of days based on the month
        switch(month){
            case 1:
                System.out.println("January of " + year + " has " + 31 +  " days.");
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){ // Check if it's a leap year
                    System.out.println("February of " + year + " has " + 29 + " days.");
                }
                else{
                    System.out.println("February of " + year + " has " + 28 + " days.");
                }
                break;
            case 3:
                System.out.println("March of " + year + " has " + 31 + " days.");
                break;
            case 4:
                System.out.println("April of " + year + " has " + 30 + " days.");
                break;
            case 5:
                System.out.println("May of " + year + " has " + 31 + " days.");
                break;
            case 6:
                System.out.println("June of " + year + " has " + 30 + " days.");
                break;
            case 7:
                System.out.println("July of " + year + " has " + 31 + " days.");
                break;
            case 8:
                System.out.println("August of " + year + " has " + 31 + " days.");
                break;
            case 9:
                System.out.println("September of " + year + " has " + 30 + " days.");
                break;
            case 10:
                System.out.println("October of " + year + " has " + 31 + " days.");
                break;
            case 11:
                System.out.println("November of " + year + " has " + 30 + " days.");
                break;
            case 12:
                System.out.println("December of " + year + " has " + 31 + " days.");
                break;
            default: System.out.println("Invalid month entered.");
        }
    } // End of findDaysInMonth method
    
    public static void palindromeInt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit integer: ");
        int num = input.nextInt();
        
        if((num > 999 || (num < 99 && num > -99)) || (num < -999 || (num > -99 && num < 99))){ // make sure input has 3 digits
            System.out.println("Invalid input.");
        }
        else{
            // Get digits and determine if number is a palindrome (that digit 1 == digit 2)
            int firstDigit = num % 10;
            int thirdDigit = num / 100;
        
            if(firstDigit == thirdDigit){
                System.out.println(num + " is a palindrome.");
            }
            else{
                System.out.println(num + " is not a palindrome.");
            }
        }
    } // End of palindromeInt method
    
    public static void determineShippingCost(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the package weight (lbs): ");
        double weight = input.nextDouble();
        
        // Cancel operation on any invalid inputs
        if(weight <= 0){
            System.out.println("Invalid input.");
        }
        else if(weight > 20){
            System.out.println("The package cannot be shipped.");
        }
        else{
            // Output price based on weight
            if(weight > 10){
                System.out.println("The package will cost $10.50 to ship");
            }
            else if(weight > 3 && weight < 10){
                System.out.println("The package will cost $8.50 to ship");
            }
            else if(weight < 1 && weight < 3){
                System.out.println("The package will cost $5.50 to ship");
            }
            else {
                System.out.println("The package will cost $3.50 to ship");
            }
        }
    } // End of determineShippingCost method
    
    public static void lottery(){
        // Get user's guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit integer as your lottery number guess: ");
        int guessNum = input.nextInt();
        
        int winNum = (int)(Math.random() * 10000);
        
        // Extract digits from guess and lottery number
        int guessDigit1 = guessNum % 10, 
            guessDigit2 = (guessNum / 10) % 10, 
            guessDigit3 = (guessNum / 100) % 10,
            guessDigit4 = guessNum / 1000;
        
        int winDigit1 = winNum % 10, 
            winDigit2 = (winNum / 10) % 10, 
            winDigit3 = (winNum / 100) % 10,
            winDigit4 = winNum / 1000;
        
        if(guessNum < 1000){ // Make sure number has 4 digits and is positive
            System.out.println("Invalid guess.");
        }
        else{
            if(guessNum == winNum){ // The guess matches exactly the lottery number
                System.out.println("You won $10,000!");
            }
            // Check if all digits match at least one digit in the lottey number
            else if((guessDigit1 == winDigit1 || guessDigit1 == winDigit2 || guessDigit1 == winDigit3 || guessDigit1 == winDigit4) &&
                    (guessDigit2 == winDigit1 || guessDigit2 == winDigit2 || guessDigit2 == winDigit3 || guessDigit2 == winDigit4) &&
                    (guessDigit3 == winDigit1 || guessDigit3 == winDigit2 || guessDigit3 == winDigit3 || guessDigit3 == winDigit4) &&
                    (guessDigit4 == winDigit1 || guessDigit4 == winDigit2 || guessDigit4 == winDigit3 || guessDigit4 == winDigit4)){
                System.out.println("You won $3,000!");
            }
            // Check if only a single digit matches a digit in the lottery number
            else if((guessDigit1 == winDigit1 || guessDigit1 == winDigit2 || guessDigit1 == winDigit3 || guessDigit1 == winDigit4) ^
                    (guessDigit2 == winDigit1 || guessDigit2 == winDigit2 || guessDigit2 == winDigit3 || guessDigit2 == winDigit4) ^
                    (guessDigit3 == winDigit1 || guessDigit3 == winDigit2 || guessDigit3 == winDigit3 || guessDigit3 == winDigit4) ^
                    (guessDigit4 == winDigit1 || guessDigit4 == winDigit2 || guessDigit4 == winDigit3 || guessDigit4 == winDigit4)){
                System.out.println("You won $1,000!");
            }
            else{
                System.out.println("You lost!");
            }
        }
    } // End of lottery method
    
    public static void rockPaperScissors(){
        // Generate computer's move
        int computerChoice = (int)(Math.random() * 3);
        
        // Get user's move
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your move from the following: Scissors (0), Rock (1), Paper (2).");
        int userChoice = input.nextInt();
        
        // All the possible outcomes of the game
        switch(userChoice){
            case 0:
                if(computerChoice == userChoice){
                    System.out.println("You chose scissors.\nThe computer chose scissors too.\nIt is a draw.");
                }
                else if(computerChoice == 1){
                    System.out.println("You chose scissors.\nThe computer chose rock.\nYou lost.");
                }
                else{
                    System.out.println("You chose scissors.\nThe computer chose paper.\nYou win!");
                }
                break;
            case 1:
                if(computerChoice == userChoice){
                        System.out.println("You chose rock.\nThe computer chose rock too.\nIt is a draw.");
                }
                else if(computerChoice == 2){
                   System.out.println("You chose rock.\nThe computer chose paper.\nYou lost.");
                }
                else{
                    System.out.println("You chose rock.\nThe computer chose scissors.\nYou win!");
                }
                break;
            case 2:
                if(computerChoice == userChoice){
                    System.out.println("You chose paper.\nThe computer chose paper too.\nIt is a draw.");
                }
                else if(computerChoice == 0){
                    System.out.println("You chose paper.\nThe computer chose scissors.\nYou lost.");
                }
                else{
                    System.out.println("You chose paper.\nThe computer chose rock.\nYou win!");
                }
                break;
            default: System.out.println("Invalid input.");
        }
    } // End of rockPaperScissors method
} // End of Lab32 class
