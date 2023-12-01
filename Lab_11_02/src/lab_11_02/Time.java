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
        this.second = second;
     
        if(second >= 60){ // Correct time if values greater than 60 are input
            this.second = second % 60;
            minute += second / 60;
        }
        this.minute = minute;
        
        if(minute >= 60){ // Correct time if values greater than 60 are input
            this.minute = minute % 60;
            hour += minute / 60.0;
        }
        this.hour = (hour >= 24) ? hour % 24 : hour;
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