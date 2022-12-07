package src.ru.mirea.task3;

import java.util.Random;
import java.util.Scanner;

class Application {
   private Circle[] circleArr;
   private int size = 0;
   public void setSize(int a) {
       size = a;
   }
   public void sortArr() {
            for (int i = 0; i < size; i++) {
                for ( int j = size - 1 ; j > 0; j--) {
                    if (circleArr[j].getRadius() < circleArr[j-1].getRadius()) {
                        Circle temp;
                        temp = circleArr[j];
                        circleArr[j] = circleArr[j-1];
                        circleArr[j-1] = temp;
                    }
                }
            }
   }
   public Circle findMin() {
       Circle min = circleArr[0];
       for (int i = 0; i < size; i++)
           if (circleArr[i].getRadius() < min.getRadius()) min = circleArr[i];
           return min;
   }
    public Circle findMax() {
        Circle max = circleArr[0];
        for (int i = 0; i < size; i++)
            if (circleArr[i].getRadius() > max.getRadius()) max = circleArr[i];
        return max;
    }
   public void displayArrInfo() {
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
       Random random = new Random();
       for (int i = 0; i < size; i++)
       {
           circleArr[i] = new Circle(Math.random() * 201 - 100, Math.random() * 201 - 100, random.nextDouble()*101 - 1);
       }
       Circle minCirc = findMin();
       Circle maxCirc = findMax();
       System.out.println("Наименьшая окружность: ");
       minCirc.displayInfo();
       System.out.println("Наибольшая окружность: ");
       maxCirc.displayInfo();
       sortArr();
       displayArrInfo();
   }
}

public class Tester {
    public static void main(String[] args) {
        Application app = new Application();
        app.createArr();
    }
}
