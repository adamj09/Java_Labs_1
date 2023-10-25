package lab1.pkg1;

public class Lab11 {
    public static void main(String[] args) {
        helloWorld();
        simpleSumDemo();
        calculateAreaAndPerimeter();
    }
    
    public static void helloWorld() {
        System.out.println("Hello World!");
    }
    
    public static void simpleSumDemo() {
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
    }
    
    public static void calculateAreaAndPerimeter() {
        float width = 4.5f, height = 7.9f;
        float area = width * height;
        float perimeter = (width * 2) + (height * 2);
        
        System.out.print("Area: " + area + '\n' + "Perimeter: " + perimeter + '\n');
    }
}
