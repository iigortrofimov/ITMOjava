package patterns.homework.task1_Decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


/*1. Используя паттерн Decorator создать шифрующие потоки ввода/вывода с помощью XOR
        (можете выбрать другой способ). Они должны наследовать FilterInputStream и FilterOutputStream.
        Конструктор этих потоков должен принимать пароль в виде массива
        байт и поток, который он декорирует.

        Использование должно выглядеть следующим образом:
        Трафик автоматически шифрует и дешифруется:
        InputStream in = new CryptoInputStream(socket.getInputStream(), passwordArray);
        OutputStream out = new CryptoOutputStream(socket.getOutputStream(), passwordArray);

        Сохраняем в шифрованный файл и читаем из шифрованного файла:
        InputStream in = new CryptoInputStream(new FileInputStream("test.bin"), passwordArray);
        OutputStream out = new CryptoOutputStream(new FileOutputStream("test.bin"), passwordArray);

        Для простоты можете начать имплементацию, где пароль - один байт.*/


public class CryptoInputStream extends FilterInputStream {

    private byte[] passwordArray;
    private int position = 0;

    protected CryptoInputStream(InputStream in, byte[] passwordArray) {
        super(in);
        this.passwordArray = passwordArray;
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        data = data ^ passwordArray[position % passwordArray.length];
        position++;
        return data;
    }
}
