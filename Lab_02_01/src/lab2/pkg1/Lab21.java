package lab2.pkg1;

import java.util.Scanner;

public class Lab21 {
    public static void main(String[] args) {
        //milesToKilometers();
        //volumeOfEquilateralTriangleBasePyramid();
        calculateTips();
        //productOfDigitsInInteger();
        //minimumRunwayLength();
    } // End of main method
    
    public static void milesToKilometers(){
        final double CONVERSION_RATE = 1.6;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of miles: ");
       
        double miles = input.nextDouble();
        double kilometers = miles * CONVERSION_RATE;
        
        System.out.println(miles + " miles = " + kilometers + " kilometers.");
    } // End of milesToKilometers method
    
    public static void volumeOfEquilateralTriangleBasePyramid(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double length = input.nextDouble();
        
        double area = (Math.sqrt(3)/4) * Math.pow(length, 2);
        double volume = area * length;
        
        System.out.println("Area: " + area + "\nVolume: " + volume);
    } // End of volumeOfEquilateralTriangleBasePyramid method
    
    public static void calculateTips(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter subtotal ($): ");
        double subTotal = input.nextDouble();
        
        System.out.print("Enter gratuity rate (%): ");
        double gratuityRate = input.nextDouble();
        
        double grandTotal = subTotal + (subTotal * (gratuityRate / 100.0));
        System.out.println("Grand total: $" + grandTotal);
    } // End of calculateTips method
    
    public static void productOfDigitsInInteger(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 9 and 1000 (non-inclusive): ");
        int num = input.nextInt();
        
        if(num >= 1000 || num <= 9){ // Check if input values are within the accepted range
            System.out.println("Cannot input an integer that is outside the specified range. Cancelling operation.");
            return;
        }
        
        // Extract each digit from the number
        int firstDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = 1;
        
        if(num > 99) // If number has 3 digits, extract third digit
           thirdDigit = num / 100;
        
        int product = firstDigit * secondDigit * thirdDigit;
        System.out.println("Product of all digits: " + product);
    } // End of productOfDigitsInInteger method
    
    public static void minimumRunwayLength(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the airplane's take-off speed (m/s): ");
        double speed = input.nextDouble();
                
        System.out.print("Enter the airplane's acceleration (m/s^2): ");
        double acceleration = input.nextDouble();
        
        double minRunwayLength = Math.pow(speed, 2) / (2 * acceleration);
        System.out.println("Minimum runway length: " + minRunwayLength + 'm');
    }// End of minimumRunwayLength method
} // End of Lab21 class
