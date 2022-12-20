package src.ru.mirea.opt3;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int i;
        for(i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("sum = " + sum);
        sum = 0;
        i = 0;
        while (i < arr.length)
        {
            sum+= arr[i];
            i++;
        }
        System.out.println("sum = " + sum);
        sum = 0;
        i = 0;
        do
        {
            sum+= arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("sum = " + sum);
    }
}
