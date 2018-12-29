package patterns.homework.task2_Observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Alarm> alarmList = new ArrayList<>();

    public void addAlarm(Alarm alarm) {
        alarmList.add(alarm);
    }

    public void deleteAlarm(Alarm alarm) {
        alarmList.remove(alarm);
    }

    public void notifyObservers(int temp) {
        for (Alarm alarm : alarmList) {
            alarm.tempChanged(temp);
        }
    }

    public void tempChange(int temp) {
        System.out.println("Current t: " + temp + " C");
        this.notifyObservers(temp);
    }
}
