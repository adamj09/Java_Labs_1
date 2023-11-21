package lab_10_02;

public class Lab_10_02 {
    public static void main(String[] args){
        //rectangleTest(); // Question 1
        //stockTest(); // Question 2
        //stopwatchTest(); // Question 3
        //fanTest(); // Question 4
        regularPolygonTest(); // Question 5
    }

    public static void rectangleTest(){
        Rectangle[] rectangles = { new Rectangle(4, 40), new Rectangle(3.5, 35.9) } ;

        for(int i = 0; i < rectangles.length; i++){
            System.out.printf("\nRectangle %d:\n", (i + 1));
            System.out.printf("width: %.2f\nheight: %.2f\narea: %.2f\nperimeter: %.2f\n", 
                rectangles[i].getWidth(), rectangles[i].getHeight(), rectangles[i].getArea(), rectangles[i].getPerimeter());
        }
    }

    public static void stockTest(){
        Stock oracleStock = new Stock("Oracle Corporation", "ORCL");
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(34.35);
        System.out.printf("%s (%s) change: %.2f%%", oracleStock.getName(), oracleStock.getSymbol(), oracleStock.changePercent());
    }

    public static void stopwatchTest(){
        // Fill array with descending numbers
        double[] array = new double[100000];
        for(int i = 0, j = array.length - 1; i < array.length; i++, j--){
            array[i] = j;
        }

        // Time the selection sort
        Stopwatch stopwatch = new Stopwatch();
        // Selection Sort (convert array to ascending numbers)
        for(int i = 0; i < array.length; i++){
            double min = array[i];
            int minIndex = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            if(array[minIndex] != array[i]){
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
        stopwatch.stop();

        System.out.printf("Elapsed time (ms) for selection sort (%d numbers): %f", array.length, stopwatch.getElapsedTime() / 1000000.0);
    }

    public static void fanTest(){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColour("yellow");
        fan1.setOnState(true);

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColour("blue");
        fan2.setOnState(false);

        System.out.printf("\tFan 1:\n%s\n\tFan 2:\n%s", fan1.toString(), fan2.toString());
    }

    public static void regularPolygonTest(){
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon 1:\nPerimeter: %.4f\nArea: %.4f\n", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("Polygon 2:\nPerimeter: %.4f\nArea: %.4f\n", polygon2.getPerimeter(), polygon2.getArea());
        System.out.printf("Polygon 3:\nPerimeter: %.4f\nArea: %.4f\n", polygon3.getPerimeter(), polygon3.getArea());
    }
}