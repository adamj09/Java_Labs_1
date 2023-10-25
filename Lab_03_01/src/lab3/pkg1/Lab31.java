package lab3.pkg1;

import java.util.Scanner;

public class Lab31 {
    public static void main(String[] args) {
        //solveQuadraticEquation();
        //generateRandomMonth();
        //findFutureDates();
        sortThreeIntegers();
    }
    
    public static void solveQuadraticEquation(){
        // Get necessary variables
        Scanner input = new Scanner(System.in);
        System.out.print("Input values a, b, and c respectively: ");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
    
        double discriminant = Math.pow(b, 2.0) - 4 * a * c; // calculate discriminant first
        if(discriminant > 0){ // discriminant has value
            double root1 = ((-b) + Math.pow(discriminant, 0.5)) / (2 * a), 
                   root2 = ((-b) - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("This equation has two roots: " + root1 + " and " + root2);
        }
        else if (discriminant == 0){ // discrimiant has no value (+- 0)
            double root = (-b) / (2 * a);
            System.out.println("This equation has one root: " + root);
        }
        else{ // discriminant is the square root of a negative number, so no real numbers can be found
            System.out.println("This equation has no real roots.");
        }
    } // End of solveQuadraticEquation method
    
    public static void generateRandomMonth(){
        int randNum = (int)((Math.random() * 12) + 1); // Get random number from 1 to 12 (inclusive)
        String month;
        // Assign random number to day of month
        if(randNum == 1){
            month = "January";
        } 
        else if(randNum == 2){
            month = "February";
        }
        else if(randNum == 3){
            month = "March";
        }
        else if(randNum == 4){
            month = "April";
        }
        else if(randNum == 5){
            month = "May";
        }
        else if(randNum == 6){
            month = "June";
        }
        else if(randNum == 7){
            month = "July";
        }
        else if(randNum == 8){
            month = "August";
        }
        else if(randNum == 9){
            month = "September";
        }
        else if(randNum == 10){
            month = "October";
        }
        else if(randNum == 11){
            month = "November";
        }
        else{
            month = "December";
        }
            
        System.out.println(month);
    } // End of generateRandomMonth method
    
    public static void generateRandomMonthWithArray(){
       int randNum = (int)((Math.random() * 12) + 1); // Get random number from 1 to 12 (inclusive)
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", 
            "September", "October", "November", "December"};
        System.out.println("Random month: " + months[randNum]);
    } // End of generateRandomMonthWithArray method
    
    public static void findFutureDates(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days ahead of today you would like to count: ");
        int numDaysAhead = input.nextInt();
        
        int futureDay = (numDaysAhead + today) % 7; // find future day number
        
        String todayName, futureDayName;
        // Set today's day name for display
        if(today == 0){
            todayName = "Sunday";
        }
        else if(today == 1){
            todayName = "Monday";
        }
        else if(today == 2){
            todayName = "Tuesday";
        }
        else if(today == 3){
            todayName = "Wednesday";
        }
        else if(today == 4){
            todayName = "Thursday";
        }
        else if(today == 5){
            todayName = "Friday";
        }
        else{
            todayName = "Saturday";
        }
        // Set future day name for display
        if(futureDay == 0){
            futureDayName = "Sunday";
        }
        else if(futureDay == 1){
            futureDayName = "Monday";
        }
        else if(futureDay == 2){
            futureDayName = "Tuesday";
        }
        else if(futureDay == 3){
            futureDayName = "Wednesday";
        }
        else if(futureDay == 4){
            futureDayName = "Thursday";
        }
        else if(futureDay == 5){
            futureDayName = "Friday";
        }
        else{
            futureDayName = "Saturday";
        }
        
        System.out.println("Today is " + todayName + " and the future day is " + futureDayName);
    } // End of findFutureDates method
    
    public static void findFutureDatesWithArray(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days ahead of today you would like to count: ");
        int numDaysAhead = input.nextInt();
        
        int futureDay = (numDaysAhead + today) % 7; // find future day number
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Today is " + days[today] + " and the future day is " + days[futureDay]);
    }
    
    public static void  sortThreeIntegers(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three integers to be sorted: ");
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        
        // There's 6 possible ways of ordering 3 digits:
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
    } // End of sortThreeIntegers method
} // End of Lab31 class2