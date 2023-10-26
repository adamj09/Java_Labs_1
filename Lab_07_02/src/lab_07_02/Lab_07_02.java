package lab_07_02;

import java.util.Scanner;

public class Lab_07_02 {
    public static void main(String[] args) {
        //displayGrades();
        //displayReversedNumbers();
        countNumberOccurence();
    }

    public static void displayGrades(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        double[] scores = new double[input.nextInt()];

        System.out.print("Enter the students' scores: ");

        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextDouble();
            if(scores[i] < 0 || scores[i] > 100){ // make sure scores are possible scores
                System.out.println("Invalid input: all scores must be positive and less than or equal to 100.");
                return;
            }
        }
        char[] grades = new char[scores.length];
        System.arraycopy(scoresToGrades(scores), 0, grades, 0, scores.length);
        for(int i = 0; i < scores.length; i++){
            System.out.printf("Student %d's score is %.2f and their grade is %s\n", i, scores[i], grades[i]);
        }
    } // End of displayGrades method

    public static char[] scoresToGrades(double[] scores){
        double bestScore = 0;
        for(double score : scores){ // get the max score
            if(score > bestScore) bestScore = score;
        }

        char[] grades = new char[scores.length];
        for(int i = 0; i < scores.length; i++){ // initialize grades array with scores
            if(scores[i] >= (bestScore - 10)) grades[i] = 'A';
            else if(scores[i] >= (bestScore - 20)) grades[i] = 'B';
            else if(scores[i] >= (bestScore - 30)) grades[i] = 'C';
            else if(scores[i] >= (bestScore - 40)) grades[i] = 'D';
            else grades[i] = 'F';
        }

        return grades;
    } // End of scoresToGrades method

    public static void displayReversedNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] original = new int[10];
        
        for(int i = 0; i < original.length; i++){
            original[i] = input.nextInt();
        }

        int[] reversed = new int[original.length];
        System.arraycopy(reverseNumbers(original), 0, reversed, 0, original.length);
        for(int value : reversed){
            System.out.print(value + " ");
        }
    } // End of displayReversedNumbers method

    public static int[] reverseNumbers(int[] original){
        int[] reversed = new int[original.length];

        for(int i = original.length - 1, j = 0; i >= 0 && j < original.length; i--, j++){
            reversed[j] = original[i];
        }

        return reversed;
    } // End of reverseNumbers method

    public static void countNumberOccurence(){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];
        int[] numberCounts = new int[100];

        for(int i = 0; i < numbers.length; i++){
            int currentNumber = input.nextInt();
            if(currentNumber == 0) break;

            if(currentNumber > 100 || currentNumber < 1){
                System.out.println("Invalid input: numbers cannot be greater than 100 or less than 1");
                return;
            }

            if(containsNumber(numbers, currentNumber)){
                numberCounts[firstOccurence(numbers, currentNumber)]++;
            }
            else{
                numbers[i] = currentNumber;
                numberCounts[i]++;
            }
        }

        for(int i = 0; numbers[i] != 0; i++){
            System.out.printf("%d occurs %d %s\n", numbers[i], numberCounts[i], (numberCounts[i] > 1) ? "times": "time");
        }
    }

    public static int firstOccurence(int[] numbers, int number){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number)
                return i;
        }
        System.out.println("This array does not contain the requested number.");
        return -1;
    }

    public static boolean containsNumber(int[] numbers, int number){
        for(int num : numbers)
            if(num == number) return true;

        return false;
    }
}