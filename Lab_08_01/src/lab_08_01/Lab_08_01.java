package lab_08_01;

import java.util.Scanner;

public class Lab_08_01 {
    public static void main(String[] args) {
        //countSingleDigits();
        //averageTest();
        //minimumTest();
        //indexMinimumTest();
        randomArray();
    }

    public static void countSingleDigits(){
        int[] numbers = new int[100];
        int[] counts = new int[10];

        for(int i = 0; i < numbers.length; i++){ // fill numbers array
            numbers[i] = (int)(Math.random() * 10);
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < numbers.length; j++){ // get number count for current number
                if(numbers[j] == i){
                    counts[i]++;
                }
            }
            System.out.printf("%d count: %d\n", i, counts[i]); // display the count for the current number
        }
    } // end of countSingleDigits method

    public static int average(int[] array){
        int sum = 0;
        for(int number : array){
            sum += number;
        }
        return sum / array.length;
    } // end of average(int[]) method

    public static double average(double[] array){
        double sum = 0;
        for(double number : array){
            sum += number;
        }
        return sum / array.length;
    } // end of average(double[]) method

    public static void averageTest(){
        Scanner input = new Scanner(System.in);
        char dataType;

        while(true){ // ask for data type from user
            System.out.print("Enter desired data type (D or I): ");
            dataType = input.nextLine().charAt(0);

            if(dataType == 'D' || dataType == 'I'){
                break;
            }
            System.out.println("Invalid data type entered: must enter D or I.");
        }
        // find average of values using the appropriate method for the data type
        if(dataType == 'D'){
            double[] doubleArray = new double[10];
            System.out.print("Enter 10 double values: ");

            for(int i = 0; i < 10; i++){
                doubleArray[i] = input.nextDouble();
            }

            System.out.printf("\nAverage is: %.2f\n", average(doubleArray));
        }
        else {
            int[] integerArray = new int[10];
            System.out.print("Enter 10 integer values: ");

            for(int i = 0; i < 10; i++){
                integerArray[i] = input.nextInt();
            }

            System.out.printf("\nAverage is: %d\n", average(integerArray));
        }
    } // end of averageTest method

    public static double minimum(double[] array){
        double minimum = array[0];
        for(double number : array){
            if(number < minimum){
                minimum = number;
            }
        }
        return minimum;
    } // end of minimum method

    public static void minimumTest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double[] numbers = new double[10];
        for(int i = 0; i < numbers.length; i++){ // fill array with user input
            numbers[i] = input.nextDouble();
        }

        System.out.printf("\nThe minimum number is: %.2f\n", minimum(numbers));
    } // end of minimumTest method

    public static int indexMinimum(double[] array){
        double minimum = array[0];
        for(double number : array){ // find minimum
            if(number < minimum){
                minimum = number;
            }
        }
    
        for(int i = 0; i < array.length; i++){ // find index of minimum
            if(array[i] == minimum){
                return i;
            }
        }
        return -1;
    } // end of indexMinimum method

    public static void indexMinimumTest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double[] numbers = new double[10];
        for(int i = 0; i < numbers.length; i++){ // fill array with user input
            numbers[i] = input.nextDouble();
        }

        System.out.printf("\nThe index of the minimum is: %d", indexMinimum(numbers));
    } // end of indexMinimumTest method

    public static void randomArray(){
        int[] originalArray = new int[10];

        for(int i = 0; i < originalArray.length; i++){
            originalArray[i] = (int)((Math.random() * 61) + 20);
        }

        // Print enhanced for loop and while loop (A)
        System.out.println("Original array printed with enhanced for loop: ");
        for(int number : originalArray){
            System.out.print(number + " ");
        }

        System.out.println("\nOriginal array printed with while loop: ");
        int i = 0;
        while(i < originalArray.length){
            System.out.print(originalArray[i] + " ");
            i++;
        }

        // Sum and Average (B)
        int sum = 0;
        for(int number : originalArray){
            sum += number;
        }
        double average = sum / originalArray.length;
        System.out.printf("\nSum of original array: %d\nAverage of original array: %.2f\n", sum, average);
    
        // Max and min value (C)
        int maximum = originalArray[0], minimum = originalArray[0];
        for(int number : originalArray){
            if(number > maximum){
                maximum = number;
            }
            if(number < minimum){
                minimum = number;
            }
        }
        System.out.printf("\nMaximum of original array: %d\nMinimum of original array: %d\n", maximum, minimum);

        
    } // end of randomArray method
}