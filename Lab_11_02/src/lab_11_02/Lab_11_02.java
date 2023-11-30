package lab_11_02;

import java.util.Scanner;

public class Lab_11_02 {
    public static void main(String[] args) {
        //locationDemo();
        linearEquationDemo();
    }

    public static void locationDemo(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the matrix's number of rows and columns respectively: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the matrix row by row: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);
        System.out.printf("The largest element is %.2f, located at (%d, %d).", location.maxValue, location.row, location.column);
    }
    
    public static void linearEquationDemo(){
        //LinearEquation equation = new LinearEquation(3.4, 50.2, 44.5, 2.1, 0.55, 5.9);
        LinearEquation equation = new LinearEquation(1, 2, 2, 4, 4, 5);
        if(!equation.isSolvable()){
            System.out.print("This equation has no solutions.\n");
        }
        else{
            System.out.printf("The solution for x is %.2f, the solution for y is %.2f\n", equation.getX(), equation.getY());
        }
    }
}
