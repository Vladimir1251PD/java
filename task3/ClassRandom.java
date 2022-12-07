package src.ru.mirea.task3;

import java.util.Random;

    public class ClassRandom {
        public static void main(String[] args) {
            Random r = new Random();
            int i;
            int[] arr = new int[10];
            System.out.println("*Класс Random*");
            System.out.println("Неотсортированнный массив случайных целых чисел: ");
            for (i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(100) - 1;
                if (i == arr.length - 1)
                    System.out.println(arr[i]);
                else
                    System.out.print(arr[i] + " ");
            }
            for (i = 0; i < arr.length; i++)
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp;
                        tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            System.out.println("Отсортированнный массив случайных целых чисел: ");
            for (i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    System.out.println(arr[i]);
                else
                    System.out.print(arr[i] + " ");
            }
        }
    }
