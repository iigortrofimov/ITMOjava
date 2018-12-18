package patterns.homework.task2;


public class YellowAlarm implements Alarm {
    private int prevTemp = 0;

    @Override
    public void tempChanged(int temp) {
        if (temp >= 300 && prevTemp < 300) {
            System.out.println("Danger level \"Yellow\"");
            prevTemp = temp;
        }
    }
}
