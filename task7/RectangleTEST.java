package src.ru.mirea.task7;

import java.util.Scanner;

public class RectangleTEST {
    public static void main(String[] args) {
        System.out.println("Левая верхняя точка(x0, y0, скорость):");
        Scanner scan = new Scanner(System.in);
        float x1 = scan.nextFloat();
        float y1 = scan.nextFloat();
        float speed1 = scan.nextFloat();
        System.out.println("Правая нижняя точка(x0, y0, скорость):");
        float x2 = scan.nextFloat();
        float y2 = scan.nextFloat();
        float speed2 = scan.nextFloat();
        MovableRectangle rect = new MovableRectangle(x1,y1,speed1, x2,y2,speed2);
        System.out.println("Движутся ли точки равномерно: " + rect.SpeedTest());
        System.out.print(rect.toString());
        rect.moveDOWN();
        rect.moveLEFT();
        rect.moveRIGHT();
        System.out.print(rect.toString());
    }
}
