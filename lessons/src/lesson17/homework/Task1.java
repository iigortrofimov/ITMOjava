package lesson17.homework;

/*        Написать программу, которая удаляет из файла все слова,
        содержащие заданное количество символов (количество символов задается диапазоном,
        например 4-6). Для вывода результатов создавать
        новую директорию и файл средствами класса File*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String source = "C:\\java\\2.txt";
        String dest = "C:\\java\\1.txt";
        // read file to Collection (List)
        List<String> textList = readFile(source);
        System.out.println("Текст:\n");
        textList.forEach(System.out::println);

        List<String> newText = deleteWrongWordsToCollection(textList, 3, 6);
        System.out.println("Текст:\n");
        newText.forEach(System.out::println);
        saveToFile(dest, newText);
    }

    //Читаем файл в коллекцию List<String> по пути path

    public static List<String> readFile(String source) {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get(source));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    // Save date to the File
    public static void saveToFile(String dest, List<String> list) {
        try {
            Files.write(Paths.get(dest), list);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * Удаляем из строки "плохие" слова.
     *
     * @param line - строка для удаления в ней слов;
     * @param countBadWords - кол-во для удаления слов;
     * @param minSymbols - минимальное кол-во символов в слове включительно;
     * @param maxSymbols - максимальное кол-во символов в слове включительно;
     * @return строку без "плохих" слов;
     */

    public static String deleteWrongWords(String line, int minSymbols, int maxSymbols) {
        StringBuilder sb = new StringBuilder();
        if (line.length() != 0) {
            for (String word : line.split(" ")) {
                if (word.length() != 0) {
                    if (word.length() < minSymbols || word.length() > maxSymbols) {
                        sb.append(word).append(" ");
                    } else {
                        String s = "";
                        sb.append(s);
                    }
                }
            }
        }
        return sb.length() == 0 ? line : sb.toString();
    }

    /*
     * Метод возвращает новую коллекцию, без слов не удовлетворяющих требованию.
     *
     * @param list - коллекция данных для редоктирования;
     * @param minSymbols - минимальное кол-во символов в слове включительно;
     * @param maxSymbols - максимальное кол-во символов в слове включительно;
     * @return новую коллекцию с редактируемым текстом;
     */

    public static List<String> deleteWrongWordsToCollection(List<String> list, int minSymbols, int maxSymbols) {
        List<String> resultList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (String line : list) {
                line = line.trim();
                line = deleteWrongWords(line, minSymbols, maxSymbols);
                resultList.add(line);
            }
        }
        return resultList;
    }
}
