package src.ru.mirea.task8;

import java.util.Scanner;

public class OddCounter {
    public static void main(String[] args) {
        oddPrint();
    }
    static void oddPrint() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0){
            if (a % 2 != 0)
                System.out.println("Нечётное: "+ a);
            oddPrint();
        }
    }
}
