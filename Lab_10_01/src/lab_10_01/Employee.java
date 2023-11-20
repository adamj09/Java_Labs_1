package lab_10_01;

public class Employee {
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    Employee(String name, int hoursWorked, double hourlyRate){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    Employee(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public String getName(){
        return name;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double getSalary(){
        return hourlyRate * hoursWorked;
    }
}
