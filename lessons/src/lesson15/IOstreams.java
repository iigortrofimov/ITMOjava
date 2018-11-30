package lesson15;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;

public class IOstreams {

    protected long readByte(File file) throws IOException {
        long byteSum = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            System.out.println(fileInputStream.available());
            while (fileInputStream.available() > 0) {  // уточнить
                int data = fileInputStream.read();
                byteSum += data;
                System.out.println((char) data);
            }
            return byteSum;
        }
    }


    private void readByeArray(File file, Charset charset) throws IOException {
        try (InputStream in = new FileInputStream(file);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                System.out.println(Arrays.toString(buf));
                byteArrayOutputStream.write(buf, 0, len);  // записывает массив в поток // offset??
            }
            System.out.println(new String(byteArrayOutputStream.toByteArray(), charset));
        }
    }

    private void writeToFile(File file, boolean append, Charset charset) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, append)) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                sb.append("line ").append(i).append('\n'); // ?
            }

            byte[] bytes = sb.toString().getBytes(charset);
            fileOutputStream.write(bytes);
        }
    }

    public void writeWithBuffer(File file) throws IOException {

        try (FileOutputStream out = new FileOutputStream(file);
             BufferedOutputStream bout = new BufferedOutputStream(out)) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                sb.append("line ").append(i).append('\n');
            } // ?
            byte[] buffer = sb.toString().getBytes();
            bout.write(buffer, 0, buffer.length);
        }
    }

    private void readFromTwoFile(File[] files, Charset charset) throws IOException {
        try (
                InputStream input1 = new FileInputStream(files[0]);
                InputStream input2 = new FileInputStream(files[1]);
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ) {
            SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);


            byte[] buf = new byte[1024];

            int len;

            while ((len = sequenceInputStream.read(buf)) > 0) {
                bout.write(buf, 0, len);
            }
            System.out.println(new String(bout.toByteArray(), charset));

        }
    }

    private static void dataOutput(OutputStream outputStream) throws IOException { // writing
        DataOutputStream dataOutputStream =
                new DataOutputStream(outputStream);
        dataOutputStream.writeInt(777);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeUTF("true");
    }

    private static void dataInput(InputStream inputStream) throws IOException { // reading
        DataInputStream dataInputStream =
                new DataInputStream(inputStream);
        int a = dataInputStream.readInt();
        String str = dataInputStream.readUTF();
        boolean b = dataInputStream.readBoolean();

        System.out.printf("%s,%s,%s", a, str, b);
    }

    private String readUrl(String url, Charset charset) throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestProperty("Accept-Charset", charset.name());

        try (InputStream in = con.getInputStream()) {
            return readText(in, charset);
        }
    }

    private String readText(InputStream in, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(in, charset);

        StringBuilder sb = new StringBuilder();

        char[] buf = new char[20];
        int len;
        while ((len = reader.read(buf)) > 0) {
            sb.append(buf, 0, len);
        }
        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        //PipedInputStream pipedInputStream
        //      PipedOutputStream pipedOutputStream
        //FilterInputStream filterInputStream
        //FilterOutputStream filterOutputStream


        IOstreams iOstreams = new IOstreams();
        // reading from file on bytes
        File file = new File("javaD.txt");
        //File file2 = new File("javaDD.txt");
        //File[] files = {file, file2};
        //System.out.println(iOstreams.readByte(file));

        //iOstreams.readByeArray(file, Charset.forName("UTF-8"));
        //iOstreams.writeToFile(file, true, Charset.forName("UTF-8"));
        //iOstreams.writeWithBuffer(file);
        //iOstreams.readFromTwoFile(files, Charset.forName("UTF-8"));
//        try (OutputStream out = new FileOutputStream(file)){
//            {
//                dataOutput(out);
//            }

        try (InputStream in = new FileInputStream(file)) {
            {
                dataInput(in);
            }
        }
    }
}
