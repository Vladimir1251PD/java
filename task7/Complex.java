package src.ru.mirea.task7;

public class Complex implements MathCalculable {
    private double Re;
    private double Im;

    public Complex(double re, double im) {
        Re = re;
        Im = im;
    }
    @Override
    public Object pow(int degree) {
        double r = complexAbs();
        double cos = Re / r;
        double sin = Im / r;
        r = Math.pow(r, degree);
        cos = Math.cos(Math.acos(cos) * degree);
        sin = Math.sin(Math.asin(sin) * degree);
        Object result = new Complex(r * cos, r * sin);
        return result;
    }

    @Override
    public double complexAbs() {
        return Math.sqrt(Re * Re + Im * Im);

    }

    @Override
    public String toString() {
        return String.format("Complex{Re= %.2f Im= %.2f}", Re, Im);
    }
}
