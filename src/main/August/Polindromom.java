package main.August;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания,
а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки,
состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
Т.е. русских, китайских и прочих экзотических символов в строке не будет.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

для удаления из строки всех символов, не являющихся буквами и цифрами,
можно воспользоваться регулярным выражением "[^a-zA-Z0-9]";
найдите в классе String метод, выполняющий замену по регулярному выражению;
для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
который находится в классе StringBuilder;
в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
 */

public class Polindromom {

    public static void main(String[] args) {

        String stdin = "GetTEG";
        String strUpper = stdin.toUpperCase();
        System.out.println("Original string: " + stdin);
        System.out.println("Change word FOR UP: " + strUpper);

        String words = strUpper.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Dell #(*!& symbols: " + words);
        StringBuffer stdout = new StringBuffer(words);
        stdout.reverse();
        System.out.println("Reverse words: " + stdout + " words: " + words);

        System.out.println(words.toString().equals(stdout.toString()));

    }

}

/*
http://proglang.su/java-examples/string-uppercase
https://habr.com/ru/post/267205/
 */