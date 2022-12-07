package src.ru.mirea.task2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        String textLine;
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        textLine = in.nextLine();
        int spaceCounter = 0;
        int wordsCounter = 0;
        for (int i = 0; i < textLine.length(); i++)
        {
            if ((i == 0 && textLine.charAt(i) == ' ' || i == textLine.length()-1 && textLine.charAt(textLine.length()-1) == ' '))
                continue;
            if (textLine.charAt(i) == ' ') spaceCounter++;
            if (textLine.charAt(i) != ' ' && spaceCounter != 0 && wordsCounter ==0) {
                wordsCounter+=2;
                spaceCounter = 0;
            }
            if (textLine.charAt(i) != ' ' && spaceCounter != 0) {
                wordsCounter++;
                spaceCounter = 0;
            }
        }
        System.out.println("Кол-во слов в строке = " + wordsCounter);
    }
}
