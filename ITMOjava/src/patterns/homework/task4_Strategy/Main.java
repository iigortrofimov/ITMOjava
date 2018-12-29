package patterns.homework.task4_Strategy;

/*Стратегия. Реализовать Logger.
        1. Интерфейс ILogger с мотодом write()
        2. Реализовать три стратегии:
        ConsoleLogger - выводит сообщения в консоль
        FileLogger - записывает сообщение в файл
        TimeFileLogger - записывает сообщение в файл + текущее время
        3. Реализовать классы, исползующие эти стратегии.
        Запись в файл должна работать!*/


public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setiLogger(new ConsoleLogger());
        context.executeILogger("ConsoleLogger");
        context.setiLogger(new FileLogger());
        context.executeILogger("FileLogger");
        context.setiLogger(new TimeFileLogger());
        context.executeILogger("TimeFileLogger");
    }
}
