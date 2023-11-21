package lab_10_02;

public class Stopwatch {
    private long startTime, endTime;

    Stopwatch(){
        startTime = System.nanoTime();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = System.nanoTime();
    }

    public void stop(){
        endTime = System.nanoTime();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
