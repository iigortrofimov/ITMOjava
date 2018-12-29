package lesson27;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.*;

public class NioApi {
    //Channel:
    // FileChannel
    // DatagramChannel UDP protocol
    // SocketChannel TCP client
    // ServerSocketChannel TCP server

    //Buffer
    //Selector
    public static void write(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            // получаем канал из RandomAccessFile
            FileChannel channel = raf.getChannel();
            String text = "Text\n" + "Text\n" + "Text\n";
            byte[] bytes = text.getBytes(Charset.forName("UTF-8"));

            // Создаем буффер для записи данных
            ByteBuffer buffer = ByteBuffer.allocate(512);
            // Заполняем беффер данных
            buffer.put(bytes);
            //ставим лимит на позицию курсора
            // курсор перемещаем в начало
            buffer.flip();
            // записываем данные из буфера в канал
            // курсор перемиститься на позицию, равную количеству

            int written = channel.write(buffer);
            System.out.println("written " + written + " bytes to file " + file.getTotalSpace());

        }
    }

    public static void read(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            FileChannel channel = raf.getChannel();

            // уффер для чтения данных
            ByteBuffer byteBuffer = ByteBuffer.allocate(512);
            StringBuilder builder = new StringBuilder();

            // чтение данных
            while (channel.read(byteBuffer) != -1) {
                builder.append(new String(byteBuffer.array()), 0, byteBuffer.remaining());
            }
            // очищение буффера для слующего чтения
            byteBuffer.clear();
        }
      //  System.out.println("Read from file: " + file.getPath() +);
    }

    public static void main(String[] args) throws IOException {
        try {
            write(new File("file.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Buffer
        //       capacity - емкость буфера маняться не будет
        // position - текущее положение курсора
        // limit прежел для позиции

        ByteBuffer buffer = ByteBuffer.allocate(512);

        // putXXX / getXXX запись и чтение в буффер
        // ставим лимит на позицию курсора
        // flip()
        // rewind () - сбрасывает позицию на 0
        // clear()
        // remaining ()  - отображает сколько осталось для чтения из буффера
        buffer.position(); // возращает позицию курсора
        buffer.capacity(); // возращает размер
        buffer.limit(); // возращает существующий лимит
        buffer.limit(100); // устанавливает новый лимит
        buffer.remaining(); // показывает раницу сколько осталось для чтения к записи

        // Path path = Paths.get() // получить путь пути
        Path di = Paths.get("src");

      //  WatchService watchService = FileSystems.getDefault().newWatchService();


    }
}

