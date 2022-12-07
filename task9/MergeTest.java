package src.ru.mirea.task9;

import java.util.Arrays;

class MergeTest {
    public static void main(String[] args) {
        Student[] arr1 = new Student[] {
                new Student(1),
                new Student(11),
                new Student(111)
        };
         Student[] arr2 = new Student[] {
                 new Student(24),
                 new Student(23),
                 new Student(13),
                 new Student(76),
                 new Student(99),
                 new Student(45)
         };
         Student[] res = Merge(arr1, arr2);
         for (Student obj: res)
            System.out.print(obj + " ");
    }

    private static Student[] Merge(Student[] arr1, Student[] arr2) {
        Student[] result = new Student[arr1.length+ arr2.length];
        int index = 0;
        for (index = 0; index < arr1.length; index++)
        {
            result[index] = arr1[index];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index++;
        }
        result = MergeSort(result);
        return result;
    }

    public static Student[] MergeSort(Student[] array) {
        Student[] buffer1 = array;
        Student[] buffer2 = new Student[array.length];
        Student[] result = MergeSortInner(buffer1, buffer2, 0, array.length);
        return result;
    }
    private static Student[] MergeSortInner(Student[] buffer1, Student[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортированные.
        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = MergeSortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = MergeSortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = (sorted1 == buffer1) ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1].compareTo(sorted2[index2]) < 0
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}


