package lab_08_01;

import java.util.Scanner;

public class Lab_08_01 {
    public static void main(String[] args) {
        //countSingleDigits();
        //averageTest();
        //minimumTest();
        //indexMinimumTest();
        randomArrayTest();
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
        for(int i = 0; i < array.length; i++){ // find first index of minimum
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

    public static void randomArrayTest(){
        int[] originalArray = new int[10];

        for(int i = 0; i < originalArray.length; i++){
            originalArray[i] = (int)((Math.random() * 61) + 20);
        }

        // Print enhanced for loop and while loop (A)
        printEnhanceForAndWhile(originalArray);

        // Sum and average (B)
        printSumAndAverage(originalArray);
    
        // Max and min value (C)
        printMinMax(originalArray);

        // Reverse array (D)
        printReversed(originalArray);

        // Shuffle array (E)
        printShuffled(originalArray);
    } // end of randomArrayTest method

    public static void printEnhanceForAndWhile(int[] array){
        // Print enhanced for loop and while loop (A)
        System.out.println("\nOriginal array printed with enhanced for loop: ");
        for(int number : array){
            System.out.print(number + " ");
        }

        System.out.println("\nOriginal array printed with while loop: ");
        int i = 0;
        while(i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
    } // end of printEnhanceForAndWhile method

    public static void printSumAndAverage(int[] array){
        int sum = 0;
        for(int number : array){
            sum += number;
        }
        double average = sum / array.length;
        System.out.printf("\nSum of original array: %d\nAverage of original array: %.2f", sum, average);
    } // end of printSumAndAverage method

    public static void printMinMax(int[] array){
        int maximum = array[0], minimum = array[0];
        for(int number : array){
            if(number > maximum){
                maximum = number;
            }
            if(number < minimum){
                minimum = number;
            }
        }
        System.out.printf("\nMaximum of original array: %d\nMinimum of original array: %d", maximum, minimum);
    } // end of printMinMax method

    public static void printReversed(int[] array){
        int[] reversed = new int[array.length];
        for(int i = 0, j = array.length - 1; i < array.length && j > 0; i++, j--){ // create reversed array
            reversed[i] = array[j];
        }

        System.out.println("\nOriginal array: "); // print original
        for(int number : array){
            System.out.print(number + " ");
        }

        System.out.println("\nReversed array: "); // print reversed
        for(int number : reversed){
            System.out.print(number + " ");
        }
    } // end of printReversed method

    public static void printShuffled(int[] array){
        System.out.println("\nOriginal array: "); // print original
        for(int number : array){
            System.out.print(number + " ");
        }

        for(int i = 0; i < array.length / 2; i++){ // create shuffled
            int j = (int)(Math.random() * array.length);
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.println("\nShuffled array: "); // print shuffled
        for(int number : array){
            System.out.print(number + " ");
        }
    } // end of printShuffled method
}