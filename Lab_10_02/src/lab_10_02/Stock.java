package lab_10_02;

public class Stock {
    private String name, symbol;
    private double previousClosingPrice, currentPrice;

    Stock(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName(){
        return name;
    }

    public String getSymbol(){
        return symbol;
    }

    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public double changePercent(){
        return (currentPrice / previousClosingPrice * 100) - 100;
    }
}
