package src.ru.mirea.task2;

import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        System.out.print("Введите радиус окружности: ");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Радиус = " + circle.getRadius());
        System.out.println("Длина окружности = " + circle.getLength());
        System.out.println("Площадь = " + circle.getArea());
    }
}

