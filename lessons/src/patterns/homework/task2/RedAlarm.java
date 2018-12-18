package patterns.homework.task2;


public class RedAlarm implements Alarm {
    private int prevTemp = 0;

    @Override
    public void tempChanged(int temp) {
        if (temp >= 600 && prevTemp < 600) {
            System.out.println("Danger level \"RED\"");
            prevTemp = temp;
        }
    }
}
