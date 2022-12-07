package src.ru.mirea.task8;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
    String test;
        System.out.println("введите слово:");
        Scanner scan = new Scanner(System.in);
        test = scan.nextLine();
        if (isPalindrom(test)) System.out.println("YES");
        else System.out.println("NO");
    }
    static boolean isPalindrom(String word) {
        if (word.length() == 1 || (word.length() == 2  && word.charAt(0) == word.charAt(1)))
            return true;
        else if (word.charAt(0) != word.charAt(word.length()-1)  || (word.length() == 2  && word.charAt(0) != word.charAt(1)))
            return false;
        else {
            return isPalindrom(word.substring(1,word.length()-1));
        }
    }
}
