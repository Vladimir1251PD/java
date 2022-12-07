package src.ru.mirea.task3;

import java.util.Random;

public class RandomArrayCheck {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean isGreater = false;
        Random rand = new Random();
        for(int a: array) {
            a = rand.nextInt(90) + 10;
            System.out.print(a + " ");
        }
        for(int i = 0; i < array.length-1; i++) {
            if (array[i] >= array[i+1]) isGreater = true;
            if (isGreater) break;
        }
        if (isGreater) System.out.println("\nПоследовательность не строго возрастает");
        else System.out.println("\nПоследовательность строго возрастает");
    }
}
