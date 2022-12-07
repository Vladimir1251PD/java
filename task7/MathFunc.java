package src.ru.mirea.task7;

import java.util.Scanner;

public class MathFunc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите действительную и мнимую часть комплексного числа: ");
        double x, y;
        x = scan.nextDouble();
        y = scan.nextDouble();
        System.out.println("введите степень, в которую возвести число: ");
        int d = scan.nextInt();
        Complex z = new Complex(x, y);
        System.out.println("Модуль комплкесного числа: " + z.complexAbs());
        System.out.println(z.pow(d));
    }
}
