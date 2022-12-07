package src.ru.mirea.task8;

import java.util.Scanner;

public class ZerosUnits {
    public static void main(String[] args) {
        System.out.println("Введите количество нулей и единиц: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Количество комбинаций: " + combinations(a, b));
    }

    static int combinations(int a, int b) {
        if (a == 0 && b > 0) return 1;
        else if (a == 1 && b > 0) return b + 1;
        else if (a > 0 && b == 0) return 0;//Либо в конце 1 либо в конце 0, а предпоследняя цифра 1
        else return combinations(a, b - 1) + combinations(a - 1, b - 1);
    }
}
