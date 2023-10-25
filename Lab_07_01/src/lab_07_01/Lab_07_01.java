package lab_07_01;

import java.util.Scanner;

public class Lab_07_01 {
    public static void main(String[] args) {
        //displayCommissionsTable();
        //printChars('1', 'z', 10);
        //displayDaysInYear();
        //createMatrix();
        passwordCheck();
    }

    public static double commission(double salesValue){
        salesValue = Math.round(salesValue * 100) / 100.0; // Reduce to 2 decimal places so conditions always work

        if(salesValue <= 0){ // Make sure input is valid
            System.out.println("Invalid Input: value of sales must be greater than 0.");
            return -1;
        }
        else if(salesValue >= 0.01 && salesValue <= 5000){ // 5000 and under
            return salesValue * 0.08;
        }
        else if (salesValue >= 5000.01 && salesValue <= 10000){ // 10000 and under
            return (5000 * 0.08) + ((salesValue - 5000) * 0.1);
        }
        else{
            return (5000 * 0.08) + (5000 * 0.1) + ((salesValue - 10000) * 0.12); // above 10000
        }
    } // End of commission method

    public static void displayCommissionsTable(){
        System.out.println("Sales Value\tCommission"); // Print table title
        for(double salesValue = 10000; salesValue <= 100000; salesValue += 5000){ // start at 10,000, end at 100,000
            System.out.printf("%.2f\t%.2f\n", salesValue, commission(salesValue)); // prinf each row
        }
    } // End of displayCommissionsTable method

    public static void printChars(char start, char end, int charsPerLine){
        if(charsPerLine <= 0){ // Make sure input is valid before running anything else
            System.out.println("Invalid input: characters per line must be greater than 0.");
            return;
        }

        if(start > end){ // swap start and end if start comes after end in ASCII code
            char temp = start;
            start = end;
            end = temp;
        }

        for(int i = 1; start <= end; start++){
            System.out.print(start + " "); // print line
            if(i == charsPerLine){
                System.out.println(); // go to next line
                i = 1;
                continue;
            }
            i++;
        }
        System.out.println(); // go to next line at very end
    } // End of printChars method

    public static int daysInYear(int year){
        return (year % 4 == 0 || year % 400 == 0) ? 366 : 365; // Check if leap year and return num days
    } // End of daysInYear method

    public static void displayDaysInYear(){
        System.out.println("Number of Days in Years");
        for(int year = 2000; year <= 2020; year++){
            System.out.printf("%d: %d\n", year, daysInYear(year));
        }
    } // End of displayDaysInYear method

    public static void printMatrix(int dimensions){
        if(dimensions <= 0){ // Make sure dimensions is a valid number
            System.out.println("Invalid input: dimensions must be greater than 0.");
            return;
        }

        for(int i = 0; i < dimensions; i++){ // print matrix
            for(int j = 0; j < dimensions; j++){ // matrix rows
                System.out.print(Math.round(Math.random()) + " ");
            }
            System.out.println(); // go to next line
        }
    } // End of printMatrix method

    public static void createMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the square matrix: ");
        int dimensions = input.nextInt();

        printMatrix(dimensions);
    } // End of createMatrix method

    public static boolean isPasswordValid(String password){
        if(password.length() < 8){ // check if password is long enough
            return false; // invalid password
        }

        int digitCount = 0;
        for(int i = 0; i < password.length(); i++){
            if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))){
                return false; // invalid password if it has symbols
            }

            if(Character.isDigit(password.charAt(i))){
                digitCount++;
            }
        }
        return digitCount >= 2; // if the password has more than 2 digits, it's valid
    } // End of isPasswordValid method

    public static void passwordCheck(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String passString = input.nextLine();

        System.out.println("This password is " + (isPasswordValid(passString) ? "valid.": "invalid."));
    } // End of passwordCheck method
}