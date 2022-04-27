package ch9.ex2_3;

import java.time.LocalTime;

public class Clock {

    private int alarmHours;
    private int alarmMinutes;
    private boolean isAlarm=false;

    public String getHours()
    {
        return LocalTime.now().toString().substring(0,2);
    }

    public String getMinutes()
    {
        return LocalTime.now().toString().substring(3,5);
    }

    public String getTime() {
        int hours = Integer.parseInt(this.getHours());
        int minutes = Integer.parseInt(this.getMinutes());
        if (!isAlarm)
            return getHours() + ":" + getMinutes();
        if (alarmHours < hours || (alarmHours == hours && alarmMinutes <= minutes))
            return "\u23F0 "+getHours() + ":" + getMinutes() + " || Alarm! was at " + alarmHours+":"+alarmMinutes;
        else {
            double differentTime = alarmHours-hours + (alarmMinutes-minutes)/60.0;
            int difH = (int)differentTime;
            int difM = (int)(differentTime%1*60);
            return "⏰ "+getHours() + ":" + getMinutes() + " || Alarm will work in " + difH +"h and "+ difM +"min";
        }
    }

    public void setAlarm(int hours,int minutes)
    {
        alarmHours=hours;
        alarmMinutes=minutes;
        isAlarm=true;
    }
}
