package lab_10_02;

public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String colour = "blue";

    public int getSpeed(){
        return speed;
    }

    public boolean getOnState(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String getColour(){
        return colour;
    }

    public void setSpeed(int speed){
        if(speed > FAST){ // make sure speed does not exceed limit
            this.speed = FAST;
        }
        else if(speed < SLOW){ // make sure speed does not go below limit
            this.speed = SLOW;
        }
        else{
            this.speed = speed;
        }
    }

    public void setOnState(boolean on){
        this.on = on;
    }

    public void setRadius(double radius){
        this.radius = Math.abs(radius); // use absolute value to make sure radius is not negative
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String toString(){
        return "Speed: " + speed + "\nColour: " + colour + "\nRadius: " + radius + (on ? "\nFan is on" : "\nFan is off");
    }
}
