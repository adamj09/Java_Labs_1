package lab_11_02;

import java.util.Scanner;

public class Lab_11_02 {
    public static void main(String[] args) {
        locationDemo();
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
}
