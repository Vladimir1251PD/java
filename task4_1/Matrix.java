package src.ru.mirea.task4_1;

class Matrix {
    private double[][] matrix;
    private int stringsCount;
    private int columnCount;
    public Matrix(int n, int m, boolean insRandValues) {
        stringsCount = n;
        columnCount = m;
        matrix = new double[stringsCount][columnCount];
        if(insRandValues) {
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    matrix[i][j] = Math.random() * 22 - 11;
        }
    }
    public Matrix add(Matrix mx2){
        if(!(this.stringsCount == mx2.stringsCount && this.columnCount == mx2.columnCount)) {
            return this;
        }
        Matrix res = new Matrix(stringsCount, columnCount, false);
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[i].length; j++)
                res.matrix[i][j] = this.matrix[i][j] + mx2.matrix[i][j];
        return res;
    }
    public Matrix multiplyNumber(double a){
        Matrix res = new Matrix(stringsCount, columnCount, false);
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[i].length; j++)
                res.matrix[i][j] = this.matrix[i][j] * a;
        return res;
    }
    public void printMatrix() {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if( j == matrix[i].length-1) System.out.printf("%.1f", matrix[i][j]);
                else System.out.printf("%.1f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public Matrix multiplyMatrix(Matrix mx2) {
        if(!(this.columnCount == mx2.stringsCount)) {
            return this;
        }
        Matrix res = new Matrix(this.stringsCount, mx2.columnCount, false);
        for(int i = 0; i < this.matrix.length; i++)
            for(int j = 0; j < this.matrix[i].length; j++)
            {
                for(int k = 0; k < mx2.matrix.length; k++)
                    res.matrix[i][j] += this.matrix[i][k] * mx2.matrix[k][j];
            }
        return res;
    }
}
