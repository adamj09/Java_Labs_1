package lab_11_02;

public class Location {
    public int row, column;
    public double maxValue;

    Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] array){
        double maxValue = array[0][0];
        int row = 0, column = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > array[row][column]){
                    row = i;
                    column = j;
                    maxValue = array[row][column];
                }
            }
        }
        return new Location(row, column, maxValue);
    }
}