package lab_09_01;

import java.util.Scanner;

public class Lab_09_01 {
    public static void main(String[] args) {
        //hasFourConsecutiveTest(); // Question 1
        mergeSortedTest();
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
        int[] longerArray = (Math.max(array1.length, array2.length) == array1.length) ? selectSortInc(array1) : selectSortInc(array2);
        int[] shorterArray = (Math.min(array1.length, array2.length) == array2.length) ? selectSortInc(array2) : selectSortInc(array1);

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
    }

    public static int[] selectSortInc(int[] array){
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
}