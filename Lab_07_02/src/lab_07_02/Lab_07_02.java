package lab_07_02;

import java.util.Scanner;

public class Lab_07_02 {
    public static void main(String[] args) {
        displayGrades();
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

        for(int i = 0; i < scores.length; i++){
            System.out.printf("Student %d's score is %.2f and their grade is %s\n", i, scores[i], scoresToGrades(scores)[i]);
        }
    }

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
    }
}