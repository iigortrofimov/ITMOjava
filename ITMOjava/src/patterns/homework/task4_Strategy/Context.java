package patterns.homework.task4_Strategy;

public class Context {
    private ILogger iLogger;

    public Context() {
    }

    public Context(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    public void setiLogger(ILogger iLogger) {
        this.iLogger = iLogger;
    }

    public void executeILogger(String info) {
        iLogger.write(info);
    }
}
