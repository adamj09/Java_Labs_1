package lab_11_02;

public class Time {
    private long hour, minute, second;

    Time(){ // Current Time
        setStandardTime(System.currentTimeMillis());
    }
    
    Time(long elapsedTimeMillis){ // specify elapsed time since Jan 1, 1970
        setStandardTime(elapsedTimeMillis);
    }
    
    Time(long hour, long minute, long second){
        setStandardTime(hour * 3600000 + minute * 60000 + second * 1000);
    }
    
    private void setStandardTime(long elapsedTimeMillis){
        second = (elapsedTimeMillis / 1000) % 60;
        minute = (elapsedTimeMillis / 60000) % 60;
        hour = (elapsedTimeMillis / 3600000) % 24;
    }
    
    public long getHour(){
        return hour;
    }
    
    public long getMinute(){
        return minute;
    }
    
    public long getSecond(){
        return second;
    }
    
    public void setTime(long elapsedTimeMillis){
        setStandardTime(elapsedTimeMillis);
    }
}