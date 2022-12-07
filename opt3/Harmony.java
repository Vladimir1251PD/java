package src.ru.mirea.opt3;

public class Harmony {
    public static void main(String[] args) {
        System.out.print("Гармонический ряд: ");
        for (int i = 1; i < 11; i++)
        {
            if (i == 10) {
                System.out.printf("%.2f \n", 1/(double)i);
            }
            else
                System.out.printf("%.2f ", 1/(double)i);
        }
    }
}
