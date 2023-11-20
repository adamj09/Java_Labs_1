package lab_10_01;

public class BusDriver {
    private int ID;
    private String name;
    private int daysWorked;
    private double dailySalary;

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public int getDaysWorked(){
        return daysWorked;
    }

    public double dailySalary(){
        return dailySalary;
    }

    public void setID(int newID){
        ID = newID;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setDaysWorked(int days){
        daysWorked = days;
    }

    public void setDailySalary(double salary){
        dailySalary = salary;
    }

    public double calcSalary(){
        return dailySalary * daysWorked;
    }
}
