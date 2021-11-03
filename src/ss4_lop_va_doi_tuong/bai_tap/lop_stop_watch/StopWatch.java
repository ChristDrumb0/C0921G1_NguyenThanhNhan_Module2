package ss4_lop_va_doi_tuong.bai_tap.lop_stop_watch;

import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    long startTime;
    long endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();

    }
    public void stop(){
        this.endTime = System.currentTimeMillis();

    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }



}
