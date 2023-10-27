package lab_07_02;

import java.util.Scanner;

public class Lab_07_02 {
    public static void main(String[] args) {
        displayGrades();
        //displayReversedNumbers();
        //countNumberOccurence();
        //analyzeScores();
        //displayUniqueNumbers();
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
        System.arraycopy(scoresToGrades(scores), 0, grades, 0, scores.length); // copy contents from function return value
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
            if(scores[i] >= (bestScore - 10)){
                grades[i] = 'A';
            }
            else if(scores[i] >= (bestScore - 20)){
                grades[i] = 'B';
            }
            else if(scores[i] >= (bestScore - 30)){
                grades[i] = 'C';
            }
            else if(scores[i] >= (bestScore - 40)){
                grades[i] = 'D';
            }
            else{
                grades[i] = 'F';
            }
        }

        return grades;
    } // End of scoresToGrades method

    public static void displayReversedNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] original = new int[10];
        
        for(int i = 0; i < original.length; i++){ // fill original numbers array
            original[i] = input.nextInt();
        }

        // copy contents from function return value
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
        System.out.print("Enter integers between 1 and 100, the input ends at 0, or if there are 100 input numbers: ");
        int[] numbers = new int[100];

        // Fill array with input, stop when input is 0 or array is completely full
        for(int i = 0, currentNumber; (currentNumber = input.nextInt()) != 0 && i < numbers.length; i++){
            if(currentNumber > 100 || currentNumber < 1){ // make sure number is between 1 and 100
                System.out.println("Invalid input: numbers must be between 1 and 100.");
                return; // cancel operation if input is not valid
            }
            numbers[i] = currentNumber;
        }

        int[] uniqueNumbers = new int[100];
        for(int i = 0, j = 0; numbers[i] != 0; i++){ // store the unique numbers in an array
            if(!containsInt(uniqueNumbers, numbers[i])){
                uniqueNumbers[j] = numbers[i];
                j++;
            }
        }

        int[] numberCounts = new int[100]; 
        for(int i = 0; uniqueNumbers[i] != 0; i++){ // go through all the numbers for every unique number and count their occurences
            for(int j = 0; numbers[j] != 0; j++){
                if(numbers[j] == uniqueNumbers[i]){ // found an occurence of the current number
                    numberCounts[i]++;
                }
            }
        }

        for(int i = 0; uniqueNumbers[i] != 0; i++){ // print the occurences of each number
            System.out.printf("%d occurs %d %s\n", uniqueNumbers[i] ,numberCounts[i], (numberCounts[i] != 1) ? "times": "time");
        }
    } // End of countNumberOccurence method

    public static void analyzeScores(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some scores to analyze (max number of scores is 100), input ends with a negative number: ");
        double[] scores = new double[100];

        // fill array with input scores, stop at negative number or 100 inputs
        int scoreCount = 0;
        while(((scores[scoreCount] = input.nextDouble()) > 0) && (scoreCount < scores.length)){
            scoreCount++;
        }

        // Compute average
        double sum = 0;
        for(int i = 0; scores[i] > 0; i++){
            sum += scores[i];
        }
        double average = sum / scoreCount;

        // Compute number of scores above/equal to or below average
        int countAboveEqualAve = 0, countBelowAve = 0;
        for(int i = 0; scores[i] > 0; i++){
            if(scores[i] >= average){
                countAboveEqualAve++;
            }
            else{
                countBelowAve++;
            }
        }
        
        System.out.printf("The average score is: %.2f\nThe number of scores above or equal to the average is: %d\nThe number of scores below the average is: %d\n",
                average, countAboveEqualAve, countBelowAve);
    } // End of analyzeScores method

    public static void displayUniqueNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] numbers = new int[10];
        
        for(int i = 0; i < numbers.length; i++){ // fill original numbers array
            numbers[i] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        int uniqueCount = 0;
        for(int i = 0; i < numbers.length; i++){ // store the unique numbers in an array and keep count
            if(!containsInt(uniqueNumbers, numbers[i])){
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.print("The number of unique numbers is: " + uniqueCount + "\nThe unique numbers are: ");
        for(int i = 0; uniqueNumbers[i] != 0; i++){
            System.out.print(uniqueNumbers[i] + " ");
        }
    } // End of displayUniqueNumbers method

    public static boolean containsInt(int[] numbers, int number){
        for(int num : numbers){
            if(num == number){ 
                return true;
            }
        }
        return false;
    } // End of arrayContainsInteger method
}