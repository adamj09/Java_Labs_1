package lab_10_02;

public class RegularPolygon {
    private int numSides = 3;
    private double sideLength = 1;
    private double centerX = 0, centerY = 0;

    RegularPolygon(){};

    RegularPolygon(int numSides, double sideLength){
        if(numSides >= 3){
            this.numSides = numSides;
        }
        else{ // if numSides is invalid, automatically set to default
            this.numSides = 3;
        }
        this.sideLength = Math.abs(sideLength); // use abs to make sure sideLength is positive
    }

    RegularPolygon(int numSides, double sideLength, double centerX, double centerY){
        if(numSides >= 3){
            this.numSides = numSides;
        }
        else{ // if numSides is invalid, automatically set to default
            this.numSides = 3;
        }
        this.sideLength = Math.abs(sideLength); // use abs to make sure sideLength is positive
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getNumSides(){
        return numSides;
    }

    public double getSideLength(){
        return sideLength;
    }

    public double getCenterX(){
        return centerX;
    }

    public double getCenterY(){
        return centerY;
    }

    public void setNumSides(int numSides){
        if(numSides >= 3){
            this.numSides = numSides;
        }
        else{ // if numSides is invalid, automatically set to default
            this.numSides = 3;
        }
    }

    public void setSideLength(double sideLength){
        this.sideLength = Math.abs(sideLength); // use abs to make sure sideLength is positive
    }

    public void setCenterX(double centerX){
        this.centerX = centerX;
    }   

    public void setCenterY(double centerY){
        this.centerY = centerY;
    }

    public double getPerimeter(){
        return numSides * sideLength;
    }

    public double getArea(){
        return numSides * Math.pow(sideLength, 2) * (1 / (Math.tan(Math.PI / numSides))) / 4;
    }
}
