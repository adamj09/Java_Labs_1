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

    public double getDailySalary(){
        return dailySalary;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDaysWorked(int daysWorked){
        this.daysWorked = daysWorked;
    }

    public void setDailySalary(double dailySalary){
        this.dailySalary = dailySalary;
    }

    public double calcSalary(){
        return dailySalary * daysWorked;
    }
}
