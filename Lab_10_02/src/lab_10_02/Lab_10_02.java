package lab_10_02;

public class Lab_10_02 {
    public static void main(String[] args){
        rectangleTest(); // Question 1
    }

    public static void rectangleTest(){
        Rectangle[] rectangles = { new Rectangle(4, 40), new Rectangle(3.5, 35.9) } ;

        for(int i = 0; i < rectangles.length; i++){
            System.out.printf("\nRectangle %d:\n", (i + 1));
            System.out.printf("width: %.2f\nheight: %.2f\narea: %.2f\nperimeter: %.2f\n", 
                rectangles[i].getWidth(), rectangles[i].getHeight(), rectangles[i].getArea(), rectangles[i].getPerimeter());
        }
    }

    
}