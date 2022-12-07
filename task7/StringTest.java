package src.ru.mirea.task7;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str;
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        ProcessString processor = new ProcessString(str);
        System.out.println("Букв в строке: " + processor.countLetters());
        System.out.println("Цифр в строке: " + processor.countNumbers());
        System.out.println("Строка из символов на нечётных позициях: " + processor.processStr());
        System.out.println("Перевёрнутая строка: " + processor.invert());
    }
}
