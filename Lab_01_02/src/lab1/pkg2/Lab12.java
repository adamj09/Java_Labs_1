package lab1.pkg2;

public class Lab12 {
    public static void main(String[] args) {
        displayInfo1();
        displayInfo2();
        displayStarPattern();
    } // End of main method
    
    public static void displayInfo1(){
        String name = "Adam Johnston";
        int age = 16;
        double annualPay = 100000.50;
        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");
    } // End of displayInfo1 method
    
    public static void displayInfo2(){
        String name = "Adam Johnston", 
            address = "1265, rue du Beaujolais, Longueuil, Quebec, J4M 2X9", 
            telephoneNum = "514 433-3078",
            major = "Computer Science and Mathematics";
        System.out.println(name + '\n' + address + '\n' + telephoneNum + '\n' + major);
    } // End of displayInfo2 method
    
    public static void displayStarPattern(){
        System.out.println(
            "  *\n" + 
            " ***\n" + 
            " *****\n" + 
            "*******\n" + 
            " *****\n" + 
            " ***\n" + 
                "  *");
    } // End of displayStarPattern method
}
