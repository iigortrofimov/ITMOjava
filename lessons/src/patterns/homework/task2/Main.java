package patterns.homework.task2;

/*2. Реализовать сигнализации, реагирующие на повышение температуры (паттерн observer).
    Класс Sensor инкрементально повышает температуру, и на каждое изменение температуры оповещает слушателей
    (сигнализации). Их должно быть три, соответствующие уровням тревоги: Green (100), Yellow (300), Red (600).
    Описываете интерфейс Alarm, имеющий метод void tempChanged(int temp), и подписываете три реализации к датчику на оповещения.

    Сигнализации сработают по преодолению определенного порога температуры:
            100 градусов - Green
            300 градусов - Green, Yellow
            600 градусов - Green, Yellow, Red
    Срабатывание - вывод в консоль сообщения. Если сигнализация сработала, то сообщение
    не повторяется на дальнейшее повышение температуры, но если опустится ниже порога,
    а потом опять преодолеет, то выведется снова.*/

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        GreenAlarm greenAlarm = new GreenAlarm();
        YellowAlarm yellowAlarm = new YellowAlarm();
        RedAlarm redAlarm = new RedAlarm();

        sensor.addAlarm(greenAlarm);
        sensor.addAlarm(yellowAlarm);
        sensor.addAlarm(redAlarm);

        for (int i = 0; i < 650; i++) {
            sensor.tempChange(i);
        }

        sensor.tempChange(101);
        sensor.tempChange(99);
        sensor.tempChange(299);
        sensor.tempChange(350);
    }
}
