package ch9.ex2_3;

import java.time.LocalTime;

public class WorldClock extends Clock{

    public int hourseOffset;
    public int minuteOffset;

    public WorldClock(double offset) {
        hourseOffset=(int)offset;
        minuteOffset=(int)(60*(offset%1));
    }

    public WorldClock() {
    }

    @Override
    public String getHours() {
        return ((LocalTime.now().getHour()+hourseOffset)%24)+"";
    }

    @Override
    public String getMinutes() {
        return ((LocalTime.now().getMinute()+minuteOffset)%60)+"";
    }
}
