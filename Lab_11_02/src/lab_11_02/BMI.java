package lab_11_02;

public class BMI {
    private String name;
    private int age = 20; // default age of 20
    private double weight; // in pounds
    private double height; // in inches
    
    private static final double KILOS_PER_POUND = 0.453592, METERS_PER_INCH = 0.0254;
    
    
    public BMI(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    public BMI(String name, int age, double weight, double height){
        this(name, weight, height);
        this.age = age;
    }
    
    public BMI(String name, int age, double weight, double feet, double inches){
        this(name, age, weight, inches + (12 * feet));
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getBMI(){
        return Math.round((weight * KILOS_PER_POUND / (Math.pow((height * METERS_PER_INCH), 2))) * 100) / 100.0; // returns BMI to 2 decimal places
    }
    
    public String getStatus(){
        double bmi = getBMI();
        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi < 25){
            return "Normal";
        }
        else if(bmi < 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
}