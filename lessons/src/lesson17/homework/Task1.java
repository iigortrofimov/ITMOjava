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
        String source = "C:\\java\\1.txt";
        String dest = "C:\\java\\2.txt";

        // read file to Collection (Lost)
        List<String> textList = readFile(source);
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
     * Метод получает кол-во слов в строке по параметрам.
     *
     * @param line       - строка для поиска слов;
     * @param minSymbols - минимальное кол-во символов в слове включительно;
     * @param maxSymbols - максимальное кол-во символов в слове включительно;
     * @return кол-во слов, удовлетворяющих параметрам;
     */

    public static int getCountWrongWords(String line, int minSymbols, int maxSymbols) {
        int result = 0;
        if (line != null) {
            line = line.trim(); // удаляем пробелы в начале  и в конце строки
            if (line.length() != 0) {
                for (String word : line.split("\\s+")) { //делим строку на массив по пробелам
                    int length = word.length();
                    if (length >= minSymbols && length <= maxSymbols) {
                        result++;
                    }

                }
            }
        }
        return result;
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

    public static void deleteWrongWords(String line, int countWrongWords, int minSymbols, int maxSymbols) {
        StringBuilder sb = new StringBuilder();
        if (line.length() != 0) {
                for (String word : line.split(" ")) {
                    if (word.length() != 0){
                        if (word.length() < minSymbols && word.length() > maxSymbols){
                            sb.append(word).append(" ");
                    }
                }
            }
        }
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
                int countWrongWords = getCountWrongWords(line, minSymbols, maxSymbols);
               // line = deleteWrongWords(line, countWrongWords, minSymbols, maxSymbols);
                resultList.add(line);
            }
        }
        return resultList;
    }

}
