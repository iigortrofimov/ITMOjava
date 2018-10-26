package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String string = "Строка 1 для поиска и замены СИМВОЛОВ";
        String pattern = "иск";
        System.out.println(string.replaceAll(pattern, "!*1*")); // именно в той же последовательности
        pattern = "^Стр"; // ^ работает  ИМЕННО  с началом строки |||  $ - конец строки!
        System.out.println(string.replaceAll(pattern,"!*!**"));
        // "^Строка$"  именно эта строка т.к. с двями видами символов.

        pattern = "[иск]";// перечеснь символов , одного из указанных в независимости от порядка
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[^иск]";// перечеснь символов , одного из указанных в независимости от порядка
        System.out.println(string.replaceAll(pattern, "*"));// поиск любых символов кроме этих !
        pattern = "\\d"; // цифровой символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\D"; // не цифровой символ
        System.out.println(string.replaceAll(pattern, "*"));
        // w - буквенный символ или _
        // W - не w
        pattern = "\\w";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\W";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\s"; // любой пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\S";// не пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[а-я, ё]"; // все буквы алфавита строчные
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я, Ё]"; // все буквы алфавита строчные
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[а-яА-Я0-9]"; // все буквы алфавита строчные и цифры // [а-я][0-9] тогда должна идти буква , а
        // за ней стразу цифра
        System.out.println(string.replaceAll(pattern, "*"));

//        Pattern | Matcher
        string = "String B1 ti search a replace CHARS";
        Pattern pattern1 = Pattern.compile(".{6,}"); // . любой исмвол в строке больше 6 символов и до
        // бесконечно, иожно указать предел {} - повторение
        // "и{2,4}" ПОДРЯД например поиииск
        Matcher matcher = pattern1.matcher(string); // ищет совпадения
        System.out.println(matcher.find()); // true / false
        pattern1 = Pattern.compile("(?=.\\d)(?=.*\\[A-Z]).{8,}"); // ?= соответсвие если [] друг за другом * - значит
        // что может повторяться 0 и более раз , в скобках несколько шаблонов
        // в строчке должна быть цифра, должны быть любые из английских букв, и должен повторить не меннее 8 символов
        System.out.println(matcher.find());
        System.out.println(matcher.matches()); // полное совпадение строки на указанное правило
        pattern1 = Pattern.compile("[B | b]");// будет искать то или другое, но заменит оба


        //".[Ии].{3}"

    }
}
