package src.ru.mirea.task8;

import java.util.Scanner;

public class UnitsCounter {
    public static void main(String[] args) {
        System.out.println("Вводите числа");
        int res = count();
        System.out.println("кол-во единиц: " + res);
    }
static int count() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 1)
        {
            int b = scan.nextInt();
            if (b == 1)
            {
                return a+b+count();
            }
            else if (b == 0)
            {
                int c = scan.nextInt();
                if (c == 0)
                    return a+b+c;
                else return a+count();
            }
        }
        else if (a == 0) {
            int b = scan.nextInt();
            if (b == 0)
                return 0;
            else if (b == 1) return b+count();
        }
        return count();
}
}