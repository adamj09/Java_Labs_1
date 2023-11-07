package lab_09_01;

import java.util.Scanner;

public class Lab_09_01 {
    public static void main(String[] args) {
        //hasFourConsecutiveTest(); // Question 1
        //mergeSortedTest(); // Question 2
        //sortStringTest(); // Question 3
        //arrayExercise(); // Question 4
        sumColumnTest();
    }

    public static boolean hasFourConsecutive(int... numbers){
        int previousNumber = numbers[0], count = 1;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] == previousNumber){
                if(++count == 4){
                    return true;
                }
            }
            else{
                count = 1;
            }
            previousNumber = numbers[i];
        }
        return false;
    } // end of hasFourConsecutive method

    public static void hasFourConsecutiveTest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int[] values = new int[input.nextInt()];

        System.out.print("Enter the integers: ");
        for(int i = 0; i < values.length; i++){
            values[i] = input.nextInt();
        }
        System.out.printf("This array %s four consecutive numbers.", hasFourConsecutive(values) ? "has": "does not have");
    } // end of hasFourConsecutiveTest method

    public static int[] mergeSorted(int[] array1, int[] array2){
        int[] longerArray = (Math.max(array1.length, array2.length) == array1.length) ? sort(array1) : sort(array2);
        int[] shorterArray = (Math.min(array1.length, array2.length) == array2.length) ? sort(array2) : sort(array1);

        int[] merged = new int[array1.length + array2.length];
        int mergedIndex = 0, longIndex = 0, shortIndex = 0;

        while(shortIndex < shorterArray.length){ // merge and sort at same time
            if(shorterArray[shortIndex] < longerArray[longIndex]){ // number in short array comes first
                merged[mergedIndex++] = shorterArray[shortIndex++];
            }
            else{ // number in long array comes first
                merged[mergedIndex++] = longerArray[longIndex++];
            }
        }
        while(longIndex < longerArray.length){ // fill remaining with values from longer array
            merged[mergedIndex++] = longerArray[longIndex++];
        }

        return merged;
    } // end of merge method

    public static void mergeSortedTest(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array 1: ");
        int[] array1 = new int[input.nextInt()];
        System.out.print("Enter the size of array 2: ");
        int[] array2 = new int[input.nextInt()];

        System.out.print("Enter the values for array 1: ");
        for(int i = 0; i < array1.length; i++){
            array1[i] = input.nextInt();
        }

        System.out.print("Enter the values for array 2: ");
        for(int i = 0; i < array2.length; i++){
            array2[i] = input.nextInt();
        }

        System.out.print("Array 1 is: ");
        for(int num : array1){
            System.out.print(num + " ");
        }

        System.out.print("\nArray 2 is: ");
        for(int num : array2){
            System.out.print(num + " ");
        }

        int[] merged = mergeSorted(array1, array2);
        System.out.print("\nThe merged array is: ");
        for(int num : merged){
            System.out.print(num + " ");
        }
    } // end of mergeSortedTest method

    public static int[] sort(int[] array){
        int[] sorted = new int[array.length];
        for(int i = 0; i < array.length; i++){
            // find index of minimum value from i onwards
            int minIndex = i;
            for(int j = i; j < array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }

            // add min to sorted and swap number in array
            int temp = array[i];
            sorted[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return sorted;
    } // end of selectSortInc method

    public static String sort(String string){
        char[] sorted = new char[string.length()], unsorted = new char[string.length()];

        for(int i = 0; i < string.length(); i++){ // convert string to array
            unsorted[i] = string.charAt(i);
        }

        for(int i = 0; i < unsorted.length; i++){
            // find index of minimum value from i onwards
            int minIndex = i;
            for(int j = i; j < unsorted.length; j++){
                if(unsorted[minIndex] > unsorted[j]){
                    minIndex = j;
                }
            }

            // add min to sorted and swap number in array
            char temp = unsorted[i];
            sorted[i] = unsorted[minIndex];
            unsorted[minIndex] = temp;
        }

        String sortedString = "";
        for(int i = 0; i < sorted.length; i++){ // convert array back to string
            sortedString += sorted[i];
        }       

        return sortedString; // convert array back to string
    } // end of sort method

    public static void sortStringTest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String unsorted = input.nextLine();

        String sorted = sort(unsorted);

        System.out.print("The sorted string: " + sorted);
    } // end of sortStringTest method

    public static void arrayExercise(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the array: ");
        int[] numbers = new int[input.nextInt()];

        System.out.print("Enter the array: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        // print array, and calculate sum, max, min, average
        System.out.print("\nThe array entered: ");
        int sum = 0, max = numbers[0], min = numbers[0];
        for(int number : numbers){
            System.out.print(number + " ");
            sum += number;

            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        double average = (double)sum / numbers.length;
        // print all requested data
        System.out.printf("\nSum of the values in the array: %d\nAverage of the values in the array: %.2f" +
                "\nMaximum of the values in the array: %d\nMinimum of the values in the array: %d", sum, average, max, min);
    } // end of arrayExercise method

    public static double sumColumn(double[][] matrix, int columnIndex){
        double sum = 0;
        for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
            sum += matrix[rowIndex][columnIndex];
        }
        return sum;
    } // end of sumColumn method

    public static void sumColumnTest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements at each column: ");
        for(int column = 0; column < matrix[0].length; column++){
            System.out.printf("Column %d: %.2f\n", column, sumColumn(matrix, column));
        }
    } // end of sumColumnTest method
}