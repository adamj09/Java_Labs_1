package lab4.pkg2;

import java.util.Scanner;

public class Lab42 {
    public static void main(String[] args) {
        //stringMethodsTest();
        compareStringsTest();
        //halvesOfString();
        //findCharTest();
        //printfTest();
    }
    
    public static void stringMethodsTest(){
        // Get two phrases from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase1 = input.nextLine();
        System.out.print("Enter another phrase: ");
        String phrase2 = input.nextLine();
        
        // Combine the two phrases together
        String combinedPhrase = phrase1.concat(phrase2);
        // Print some results of methods used on both phrases
        System.out.println("The length of the combined phrase is: " + combinedPhrase.length() +
                "\nThe first character of the combined phrase is: " + combinedPhrase.charAt(0) +
                "\nThe combined phrase in uppercase is: " + combinedPhrase.toUpperCase() +
                "\nThe combined phrase in lowercase is: " + combinedPhrase.toLowerCase() +
                "\nThe combined phrase with spaces on either side removed is: " + combinedPhrase.trim() 
        );
    } // End of stringMethodsTest method
    
    public static void compareStringsTest(){
        // Get two string from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings to compare: ");
        String string1 = input.next(), string2 = input.next();
        
        // Test string methods
        System.out.println("String 1 is the same as string 2: " + string1.equals(string2) +
                "\nString 1 is the same as string 2, ignoring case: " + string1.equalsIgnoreCase(string2) +
                "\nString 1 is greater than or equal to string 2: " + (string1.compareTo(string2) >= 0) +
                "\nString 1 is greater than or equal to string 2, ignoring case: " + (string1.compareToIgnoreCase(string2) >= 0) +
                "\nString 1 starts with the same letter as string 2: " + string1.startsWith(string2.charAt(0) + "") +
                "\nString 1 ends with the same letter as string 2: " + string1.endsWith(string2.charAt(string2.length() - 1) + "")
                );
    } // End of compareStringsTest method
    
    public static void halvesOfString(){
        // Get string from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        
        // Display the first and second half of the string
        System.out.println("The first half of the string is: " + string.substring(0, (string.length()) / 2) +
                "\nThe second half of the string is: " + string.substring((string.length()) / 2)
        );
    } // End of substringMethodsTest method
    
    public static void findCharTest(){
        // Get string and char to search for from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string, and a letter to search for: ");
        String string = input.nextLine();
        char letter = input.nextLine().charAt(0);
        
        // Display information about the char's position in the string
        if(string.indexOf(letter) < 0){
            System.out.println("The character is not present in the string.");
        }
        else{
            System.out.println("The character first occurs at index " + string.indexOf(letter) +
                    "\nThe character last occurs at index " + string.lastIndexOf(letter) +
                    "\nThe character last occurs (using the lastIndexOf(s) method) at index: " + string.lastIndexOf(letter + "")
            );
            System.out.println(((string.indexOf(letter, string.length() / 2) >= 0) ? 
                    "The character is present in the second half of the string" : "\nThe character is not present in the second half of the string.")
            );
            System.out.println(((string.lastIndexOf(letter, string.length() / 2) >= 0) ? 
                    "In the first half of the string, the last occurance of the character is at index " + 
                    string.lastIndexOf(letter, string.length() / 2) : 
                    "The character is not present in the first half of the string.")
            );
            System.out.println(((string.lastIndexOf(letter, string.length() / 2) >= 0) ? 
                    "In the first half of the string, the last occurance of the character (using the lastIndexOf(s, int) method) is at index " +
                    string.lastIndexOf(letter + "", string.length() / 2) : 
                    "The character is not present in the first half of the string.")
            );
        }
    } // End of findCharTest method
    
    public static void printfTest(){
        System.out.printf("%b %c %d %3.2f %3.2e %s\n", false, 'A', 5, 5.5f, 4.5e+01, "Hello");
    }
}
