package lab_10_01;

import java.util.Scanner;

public class EmployeeDemo {
    public static void employeeDemo(){
        Scanner input = new Scanner(System.in);
        // info for employee 1
        System.out.print("Enter employee 1's name: ");
        String name1 = input.next();
        System.out.print("Enter the number of hours employee 1 worked: ");
        int hoursWorked1 = input.nextInt();
        System.out.print("Enter employee 1's hourly rate: ");
        double hourlyRate1 = input.nextDouble();
        // create employee 1
        Employee employee1 = new Employee(name1, hoursWorked1, hourlyRate1);
        
        // info for employee 2
        System.out.print("Enter employee 2's name: ");
        String name2 = input.next();
        // create employee 2
        Employee employee2 = new Employee(name2);

        // Extra info for employee 2
        System.out.print("Enter the number of hours employee 1 worked: ");
        employee2.setHoursWorked(input.nextInt());
        System.out.print("Enter employee 1's hourly rate: ");
        employee2.setHourlyRate(input.nextDouble());

        // Print info for each employee
        System.out.printf("\nEmployee 1:\nName: %s\nHours worked: %d\nSalary: $%.2f\n", employee1.getName(), employee1.getHoursWorked(), employee1.getSalary());
        System.out.printf("\nEmployee 2:\nName: %s\nHours worked: %d\nSalary: $%.2f\n", employee2.getName(), employee2.getHoursWorked(), employee2.getSalary());
    }
}
