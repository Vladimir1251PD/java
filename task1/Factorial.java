package src.ru.mirea.opt3;

import java.util.Scanner;

public class Factorial {
    private static long fact(long a)
    {
        long result =1;
        if (a == 0) return result;
        if (a < 0)
        {
            return  -1;
        }
        for (; a >=1 ; a--)
        {
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("Введите неотрицательное число: ");
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        if(a > -1)
        System.out.println("Факториал: "+ fact(a));
        else System.out.println("Ошибка! Аргумент должен быть >= 0");
    }
}
