package lab_11_02;

import java.util.Scanner;

public class Lab_11_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Simple menu to run demos from
        do{
            int selection;
            do{
                System.out.printf("Enter the desired demo to run:\n1: Location class demo\n2: LinearEquation class demo\n3: Time class demo\n4: BMI class demo\n");
                selection = input.nextInt();
                System.out.println(); // Extra spacing between menu and program ran for cleanliness
                switch(selection){
                    case 1:
                        locationDemo();
                        break;
                    case 2: 
                        linearEquationDemo();
                        break;
                    case 3:
                        timeDemo();
                        break;
                    case 4:
                        bmiDemo();
                        break;
                    default:
                        System.out.printf("Invalid selection: choose a number from 1 to 4.\n\n");
                        break;
                }
            }
            while(selection <= 0 || selection > 4);
            
            System.out.println("\nDemo complete. Type \"end\" to exit the program, or enter any other character to run another demo.");
        }
        while(!input.next().equalsIgnoreCase("end"));
    }

    public static void locationDemo(){
        Scanner input = new Scanner(System.in);

        // Get matrix from user
        System.out.print("Enter the matrix's number of rows and columns respectively: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the matrix row by row: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }
        // Find and print location of greatest value in matrix
        Location location = Location.locateLargest(array);
        System.out.printf("The largest element is %.2f, located at (%d, %d).\n", location.maxValue, location.row, location.column);
    }
    
    public static void linearEquationDemo(){
        LinearEquation equation = new LinearEquation(3.4, 50.2, 44.5, 2.1, 0.55, 5.9);
        if(equation.isSolvable()){ // if solvable print solution for x and y
            System.out.printf("Solutions: x = %.2f, y = %.2f\n", equation.getX(), equation.getY());
        }
        else{
            System.out.print("No solution.\n");
        }
    }
    
    public static void timeDemo(){
        // Time objects created using all available constructors
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);
        // Print Time
        System.out.printf("Current Time (GMT): %s%d:%s%d:%s%d\nTime (GMT) once 555,550,000 ms elapsed since midnight, January 1, 1970: %s%d:%s%d:%s%d\nArbitrarily set Time: %s%d:%s%d:%s%d\n",
                time1.getHour() < 10 ? "0" : "", time1.getHour(), time1.getMinute() < 10 ? "0" : "", time1.getMinute(), time1.getSecond() < 10 ? "0" : "",  time1.getSecond(), 
                time2.getHour() < 10 ? "0" : "", time2.getHour(), time2.getMinute() < 10 ? "0" : "", time2.getMinute(), time2.getSecond() < 10 ? "0" : "",  time2.getSecond(), 
                time3.getHour() < 10 ? "0" : "", time3.getHour(), time3.getMinute() < 10 ? "0" : "", time3.getMinute(), time3.getSecond() < 10 ? "0" : "",  time3.getSecond());
    }
    
    public static void bmiDemo(){
        // BMI objects created using all available constructors
        BMI bmiKevin = new BMI("Kevin", 148, 69);
        BMI bmiAdam = new BMI("Adam", 17, 155, 70);
        BMI bmiGiorgio = new BMI("Giorgio", 17, 220, 6, 5);
        // Print BMI Info
        System.out.printf("BMI %s: %.2f, %s\nBMI %s: %.2f, %s\nBMI %s: %.2f, %s\n",
                bmiKevin.getName(), bmiKevin.getBMI(), bmiKevin.getStatus(), 
                bmiAdam.getName(), bmiAdam.getBMI(), bmiAdam.getStatus(), 
                bmiGiorgio.getName(), bmiGiorgio.getBMI(), bmiGiorgio.getStatus());
    }
}
