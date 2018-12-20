package patterns.homework.task2_Observer;


public class GreenAlarm implements Alarm {
    private int prevTemp = 0;

    @Override
    public void tempChanged(int temp) {
        if (temp >= 100 && prevTemp < 100) {
            System.out.println("Danger level \"GREEN\"");
            prevTemp = temp;
        } else if (temp < 100) {
            prevTemp = 0;
        }
    }
}
