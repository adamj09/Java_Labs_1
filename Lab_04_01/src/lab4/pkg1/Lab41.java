package lab4.pkg1;

import java.util.Scanner;

public class Lab41 {
    public static void main(String[] args) {
        //asciiToCharacter();
        //charToUnicode();
        //decimalToHex();
        hexToBinary();
        //isVowelOrConsonant();
        //telephoneLetterToNumber();
        //randomLetter();
    } // End of main method
    
    public static void asciiToCharacter(){
        // Get code from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();
        
        if(code < 0 || code > 127){ // Check if code is a valid ASCII code
            System.out.println("Invalid input.");
        }
        else{ // Print corresponding ASCII character
            System.out.println("The character for ASCII code " + code + " is " + (char)code);
        }
    } // End of characterOfASCIICode method
    
    public static void charToUnicode(){
        // Get character from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.nextLine().charAt(0);
        // Convert then print the corresponding unicode
        System.out.println("The Unicode for the character " + character + " is " + (int)character);
    } // End of charToUnicode method
    
    public static void decimalToHex(){
        // Get decimal number from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number from 0 to 15 (inclusive): ");
        int num = input.nextShort();
        
        if(num < 0 || num > 15){ // The decimal number is larger or smaller the the hex digit set
            System.out.println("Invalid input.");
        }
        else if(num > 9){ // The decimal must be converted to a letter (from A to F)    
            char hexNum = (char)(num + 55); // Add 55 to decimal number to convert to letters
            System.out.println("The hexidecimal value is: " + hexNum);
        }
        else{ // The decimal number remains the same when converted to hex
            System.out.println("The hexidecimal value is: " + num);
        }
    } // End of decimalToHex method
    
    public static void hexToBinary(){
        // Get hex digit from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexidecimal digit: ");
        char hexDigit = input.nextLine().charAt(0);
        // Print binary value based on digit
        switch(hexDigit){
            case '0':
                System.out.println("The binary value is 0000");
                break;
            case '1':
                System.out.println("The binary value is 0001");
                break;
            case '2':
                System.out.println("The binary value is 0010");
                break;
            case '3':
                System.out.println("The binary value is 0011");
                break;
            case '4':
                System.out.println("The binary value is 0100");
                break;
            case '5':
                System.out.println("The binary value is 0101");
                break;
            case '6':
                System.out.println("The binary value is 0110");
                break;
            case '7':
                System.out.println("The binary value is 0111");
                break;
            case '8':
                System.out.println("The binary value is 1000");
                break;
            case '9':
                System.out.println("The binary value is 1001");
                break;
            case 'A':
                System.out.println("The binary value is 1010");
                break;
            case 'B':
                System.out.println("The binary value is 1011");
                break;
            case 'C':
                System.out.println("The binary value is 1100");
                break;
            case 'D':
                System.out.println("The binary value is 1101");
                break;
            case 'E':
                System.out.println("The binary value is 1110");
                break;
            case 'F':
                System.out.println("The binary value is 1111");
                break;
            default: System.out.println("Invalid input.");
        }
    } // End of hexToBinary method
    
    public static void isVowelOrConsonant(){
        // Get letter from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);
        
        if(!Character.isLetter(letter)){ // Check if input is actually a letter
            System.out.println("Invalid input.");
        }
        else{
            Character.toUpperCase(letter);
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){ // vowel
                System.out.println(letter + " is a vowel.");
            }
            else{ // consonant
                System.out.println(letter + " is a consonant.");
            }
        }
    } // End of isVowelOrConsonant method
    
    public static void telephoneLetterToNumber(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a letter: ");
         char letter = input.nextLine().charAt(0);
         letter = Character.toUpperCase(letter);
         
         switch(letter){
            case 'A', 'B', 'C':
                System.out.println("The corresponding number is 2.");
                break;
            case 'D', 'E', 'F':
                System.out.println("The corresponding number is 3.");
                break;
            case 'G', 'H', 'I':
                System.out.println("The corresponding number is 4.");
                break;
            case 'J', 'K', 'L':
                System.out.println("The corresponding number is 5.");
                break;
            case 'M', 'N', 'O':
                System.out.println("The corresponding number is 6.");
                break;
            case 'P', 'Q', 'R', 'S':
                System.out.println("The corresponding number is 7.");
                break;
            case 'T', 'U', 'V':
                System.out.println("The corresponding number is 8.");
                break;
            case 'W', 'X', 'Y', 'Z':
                System.out.println("The corresponding number is 9.");
                break;
            default: System.out.println("Invalid input.");
         }
    } // End of telephoneLetterToNumber method
    
    public static void randomLetter(){
        System.out.println("Random letter: " + (char)((int)(Math.random() * 26) + 65));
    } // End of randomLetter method
}
