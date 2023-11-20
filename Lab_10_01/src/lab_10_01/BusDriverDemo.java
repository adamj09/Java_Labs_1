package lab_10_01;

import java.util.Scanner;

public class BusDriverDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BusDriver driver1 = new BusDriver();

        System.out.println("Enter driver 1's name: ");
        driver1.setName(input.nextLine());

        System.out.println("Enter driver 1's ID: ");
        driver1.setID(input.nextInt());

        System.out.println("Enter the number of days driver 1 worked: ");
        driver1.setDaysWorked(input.nextInt());

        System.out.println("Enter the daily salary of driver 1: ");
        driver1.setDailySalary(input.nextDouble());

        BusDriver driver2 = new BusDriver();


    }
}