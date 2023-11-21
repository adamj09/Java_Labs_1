package lab_10_02;

public class Rectangle {
    private double width = 1, height = 1;

    Rectangle(){}

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }
}