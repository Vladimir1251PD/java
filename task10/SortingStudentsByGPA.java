package src.ru.mirea.task10;

import java.util.ArrayList;
import java.util.Comparator;

class SortingStudentsByGPA {
    static ArrayList<Student> iDNumber = new ArrayList<Student>(); //Массив
    public static void main(String[] args) {
        setArray();
        System.out.println("Начальный массив:");
        outArray();
        System.out.println("\nОтсортированный массив по среднему баллу:");
        MergeSort.MergeSort(iDNumber, 0, iDNumber.size()-1);
        outArray();
        iDNumber.clear();
        setArray();
        System.out.println("\nОтсортированный массив по номеру курса:");
        MergeSort.MergeSort(new StudentCourseComparator(), iDNumber, 0, iDNumber.size()-1);
        outArray();
    }
    private static class StudentCourseComparator implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.getCourseNumber().compareTo(b.getCourseNumber());
        }

    }
    //Вспомогательные методы

    private static void setArray() {
        Student student = new Student("Dummy", "Test", "Finance", 4, "FBO-13-22", 2f);
        iDNumber.add(student);
        student = new Student("Alexey", "Vilnysov", "Management", 3, "MBO-05-19", 5f);
        iDNumber.add(student);
        student = new Student("Vasya", "Kuralesov", "Mechanical Engineering", 2, "EMO-01-22", 5f);
        iDNumber.add(student);
        student = new Student("Artur", "Pirozhkov", "Actor", 4, "AMP-03-18", 4.32f);
        iDNumber.add(student);
        student = new Student("Moto", "Cyclov", "Machine Learning", 2, "IVBO-10-20", 4.5f);
        iDNumber.add(student);
    }
    interface MergeSort {
        private static void Merge(ArrayList<Student> array, int firstIndex, int middle, int lastIndex) {
            ArrayList<Student> leftArr = new ArrayList<Student>();
            ArrayList<Student> rightArr = new ArrayList<Student>();
            for(int i = firstIndex; i <= middle; i++) leftArr.add(array.get(i));
            for(int i = middle+1; i <= lastIndex; i++) rightArr.add(array.get(i));
            int i = firstIndex, ileft = 0, iright = 0;
            while(ileft < leftArr.size() && iright < rightArr.size()) {
                if (leftArr.get(ileft).compareTo(rightArr.get(iright)) >= 0) {
                    array.set(i, leftArr.get(ileft));
                    ileft++;
                }
                else {
                    array.set(i, rightArr.get(iright));
                    iright++;
                }
                i++;
            }
            while(ileft < leftArr.size())
            {
                array.set(i, leftArr.get(ileft));
                ileft++;
                i++;
            }
            while(iright < rightArr.size())
            {
                array.set(i, rightArr.get(iright));
                iright++;
                i++;
            }
        }
        static void MergeSort(ArrayList<Student> array, int firstIndex, int lastIndex) {
            if(firstIndex < lastIndex){
                int middle = firstIndex + (lastIndex - firstIndex)/2;
                MergeSort(array, firstIndex, middle);
                MergeSort(array, middle+1, lastIndex);
                Merge(array, firstIndex, middle, lastIndex);
            }
        }
        //Сравнение по другому признаку
        private static void Merge(Comparator<Student> comp, ArrayList<Student> array, int firstIndex, int middle, int lastIndex) {
            ArrayList<Student> leftArr = new ArrayList<Student>();
            ArrayList<Student> rightArr = new ArrayList<Student>();
            for(int i = firstIndex; i <= middle; i++) leftArr.add(array.get(i));
            for(int i = middle+1; i <= lastIndex; i++) rightArr.add(array.get(i));
            int i = firstIndex, ileft = 0, iright = 0;
            while(ileft < leftArr.size() && iright < rightArr.size()) {
                if (comp.compare(leftArr.get(ileft), rightArr.get(iright)) >= 0){
                    array.set(i, leftArr.get(ileft));
                    ileft++;
                }
                else {
                    array.set(i, rightArr.get(iright));
                    iright++;
                }
                i++;
            }
            while(ileft < leftArr.size())
            {
                array.set(i, leftArr.get(ileft));
                ileft++;
                i++;
            }
            while(iright < rightArr.size())
            {
                array.set(i, rightArr.get(iright));
                iright++;
                i++;
            }
        }
        static void MergeSort(Comparator<Student> comp,ArrayList<Student> array, int firstIndex, int lastIndex) {
            if(firstIndex < lastIndex){
                int middle = firstIndex + (lastIndex - firstIndex)/2;
                MergeSort(comp, array, firstIndex, middle);
                MergeSort(comp, array, middle+1, lastIndex);
                Merge(comp, array, firstIndex, middle, lastIndex);
            }
        }
    }
    private static void QuickSort(ArrayList<Student> array, int firstIndex, int lastIndex) {
        int leftInd = firstIndex;
        int rightInd = lastIndex;
        Student middleSt = array.get((firstIndex+lastIndex)/2);
        do {
            while (array.get(leftInd).compareTo(middleSt) > 0) {
                leftInd++;
            }
            while (array.get(rightInd).compareTo(middleSt) < 0) {
                rightInd--;
            }
            if (leftInd <= rightInd) {
                if (leftInd < rightInd) {
                    Student tmp = array.get(leftInd);
                    array.set(leftInd, array.get(rightInd));
                    array.set(rightInd, tmp);
                }
                leftInd++;
                rightInd--;
            }
        } while (leftInd <= rightInd);
        if (leftInd < lastIndex) {
            QuickSort(array, leftInd, lastIndex);
        }
        if (firstIndex < rightInd) {
            QuickSort(array, firstIndex, rightInd);
        }
    }
    //Сравнение по другому признаку
    private static void QuickSort(Comparator<Student> comp, ArrayList<Student> array, int firstIndex, int lastIndex) {
        int leftInd = firstIndex;
        int rightInd = lastIndex;
        Student middleSt = array.get((firstIndex+lastIndex)/2);
        do {
            while (comp.compare(array.get(leftInd), middleSt) > 0) {
                leftInd++;
            }
            while (comp.compare(array.get(rightInd), middleSt) < 0) {
                rightInd--;
            }
            if (leftInd <= rightInd) {
                if (leftInd < rightInd) {
                    Student tmp = array.get(leftInd);
                    array.set(leftInd, array.get(rightInd));
                    array.set(rightInd, tmp);
                }
                leftInd++;
                rightInd--;
            }
        } while (leftInd <= rightInd);
        if (leftInd < lastIndex) {
            QuickSort(array, leftInd, lastIndex);
        }
        if (firstIndex < rightInd) {
            QuickSort(array, firstIndex, rightInd);
        }
    }
    private static void outArray() {
        for(Student student: iDNumber) {
            //System.out.printf("Имя = %s | Фамилия = %s | Средний балл = %.1f | ;%n",student.firstName, student.lastName, student.rating);
            System.out.println(student.toString());
        }
    }
}
