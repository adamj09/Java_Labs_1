package lab_11_02;

public class Time {
    private long hour, minute, second;

    Time(){ // Current Time
        setTime(System.currentTimeMillis());
    }
    
    Time(long elapsedTimeMillis){ // specify elapsed time since Jan 1, 1970
        setTime(elapsedTimeMillis);
    }
    
    Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
        hour = (elapsedTimeMillis / 3600000) % 24;
        minute = (elapsedTimeMillis / 60000) % (elapsedTimeMillis / 3600000);
        second = (elapsedTimeMillis / 1000) % (elapsedTimeMillis / 60000);
    }
}