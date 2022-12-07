package src.ru.mirea.task8;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(reverse(n,0));
    }
    static int reverse(int n, int a) {
        if (n == 0) return a;
        else return reverse(n/10, a*10 + n % 10);
    }
}
