package src.ru.mirea.task2;

import java.util.Scanner;

public class StringSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов в массиве: ");
        int size = in.nextInt();
        in.nextLine();
        String[] arr = new String[size];
        System.out.println("Введите строки: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLine();
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size / 2; i++) {
            String tmp;
            tmp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = tmp;
        }
        System.out.print("Новый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
