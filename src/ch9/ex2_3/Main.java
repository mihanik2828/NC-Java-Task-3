package ch9.ex2_3;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Clock:");
        Clock clock = new Clock();
        System.out.println(clock.getHours());
        System.out.println(clock.getMinutes());
        System.out.println(clock.getTime());

        System.out.println();
        System.out.println("WorldClock");
        WorldClock worldClock = new WorldClock(4.5);
        System.out.println(worldClock.getHours());
        System.out.println(worldClock.getMinutes());
        System.out.println(worldClock.getTime());

        System.out.println();
        System.out.println("Alarm Clock");
        Clock clock1 = new Clock();
        System.out.println(clock1.getTime());
        clock1.setAlarm(0,53);
        System.out.println(clock1.getTime());
        clock1.setAlarm(0,56);
        System.out.println(clock1.getTime());
        clock1.setAlarm(LocalTime.now().getHour()+3,LocalTime.now().getMinute()+37);
        System.out.println(clock1.getTime());



    }
}
