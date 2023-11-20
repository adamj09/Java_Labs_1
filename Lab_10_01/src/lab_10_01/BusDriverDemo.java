package lab_10_01;

import java.util.Scanner;

public class BusDriverDemo {
    public static void busDriverDemo() {
        // Input all info
        Scanner input = new Scanner(System.in);
        BusDriver[] drivers = {new BusDriver(), new BusDriver()};

        for(int i = 0; i < drivers.length; i++){
            System.out.printf("Enter driver %d's name: ", (i + 1));
            drivers[i].setName(input.next());

            System.out.printf("Enter driver %d's ID: ", (i + 1));
            drivers[i].setID(input.nextInt());

            System.out.printf("Enter the number of days driver %d worked: ", (i + 1));
            drivers[i].setDaysWorked(input.nextInt());

            System.out.printf("Enter the daily salary of driver %d: ", (i + 1));
            drivers[i].setDailySalary(input.nextDouble());
            System.out.println();
        }

        // Display all info
        for(int i = 0; i < drivers.length; i++){
            System.out.printf("\nDriver %d\n", (i + 1));
            System.out.printf("Name: %s\nID: %d\nNumber of days worked: %d\nDaily Salary: %.2f\nMonthly Salary: %.2f\n\n", 
                drivers[i].getName(), drivers[i].getID(), drivers[i].getDaysWorked(), drivers[i].getDailySalary(), (drivers[i].getDailySalary() * drivers[i].getDaysWorked()));
        }
    }
}