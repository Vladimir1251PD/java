package src.ru.mirea.task2.Point;

import java.util.Scanner;

 class Application {
    private Circle[] circleArr;
    private int size = 0;
    public void setSize(int a) {
        size = a;
    }
    public void displayInfo() {
        System.out.println("размер массива: " + size);
        int i = 0;
        for(Circle obj: circleArr) {
            i++;
            System.out.printf("Circle %d: ", i);
            obj.displayInfo();
        }
    }
    public void createArr() {
        System.out.print("Введите кол-во объектов в массиве: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        this.setSize(a);
        circleArr = new Circle[size];
        for (int i = 0; i < size; i++)
        {
            circleArr[i] = new Circle(Math.random() * 201 - 100, Math.random() * 201 - 100);
        }
        displayInfo();
    }
}
public class Tester {
    public static void main(String[] args) {
        Application app = new Application();
        app.createArr();
    }
}
