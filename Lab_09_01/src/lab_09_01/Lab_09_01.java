package lab_09_01;

import java.util.Scanner;

public class Lab_09_01 {
    public static void main(String[] args) {
        //hasFourConsecutiveTest(); // Question 1
        int[] test = {1, 2, 3, 4, 5}, test2 = {1, 2, 3, 4, 5};
        int[] test3 = mergeSorted(test, test2);
        for(int i = 0; i < test3.length; i++){
            System.out.print(test3[i] + " ");
        }
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
        array1 = selectSortInc(array1);
        array2 = selectSortInc(array2);

        int newLength = array1.length + array2.length;
        int[] merged = new int[newLength];

        for(int i = 0; i < newLength; i += 2){
            if(array1[i] < array2[i]){
                merged[i] = array1[i];
                merged[i + 1] = array2[i];
            }
            else{
                merged[i] = array2[i];
                merged[i + 1] = array1[i];
            }
        }

        return merged;
    } // end of merge method

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