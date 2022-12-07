package src.ru.mirea.task3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NArray {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число элементов в массиве: ");
        n = scan.nextInt();
        while(n <= 0) {
            System.out.println("Вы ввели неверное значение элементов\nВведите n заново: ");
            n = scan.nextInt();
        }
        Random rand = new Random();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = rand.nextInt(n+1); // arr[i] - число в диапозоне [0, n]
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.print("arr 1 = " );
        for(int a: arr1) {
            if (a % 2 == 0) arr2.add(a);
            System.out.print(a + " ");
        }
        if (arr2.isEmpty()) System.out.println("Чётных чисел нет");
            else {
            System.out.print("\narr 2 = " );
            for(int a: arr2) {
                System.out.print(a + " ");
            }
        }

    }
}
