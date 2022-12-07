package src.ru.mirea.task9;

public class InsSortingStudentsTest{
    public static void main(String[] args) {
        Student[] arr = new Student[] {
                new Student(1),
                new Student(11),
                new Student(111),
                new Student(24),
                new Student(23),
                new Student(13),
                new Student(76),
                new Student(99),
                new Student(45),
        };
        for (Student obj: arr)
            System.out.print(obj + " ");
        inssort(arr);
        System.out.println();
        for (Student obj: arr)
            System.out.print(obj + " ");

    }
    public static void inssort(Comparable[] arr) {
        if (arr.length == 1) return;
        else for(int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while ((arr[j].compareTo(arr[j-1]) < 0) && j >=0){
                Comparable temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}