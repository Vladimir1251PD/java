package src.ru.mirea.task4_1;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix A = new Matrix(3,6, true);
        Matrix B = new Matrix(7,8, true);;
        Matrix C = A.add(B);
        Matrix D = A.multiplyNumber(6);
        System.out.println("Матрица А");
        A.printMatrix();
        System.out.println("Матрица В");
        B.printMatrix();
        System.out.println("Матрица С = А + В");
        C.printMatrix();
        System.out.println("Матрица D = 6*С");
        D.printMatrix();
        System.out.println("Матрица D = A*B");
        D = A.multiplyMatrix(B);
        D.printMatrix();
    }
}
