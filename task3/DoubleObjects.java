package src.ru.mirea.task3;

public class DoubleObjects {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14); // valueOf возвращает объект Double
        Double d2 = Double.valueOf("2.76");
        Double d3 = Double.parseDouble("5.555"); //parseDouble возвращает примитив double
        System.out.println("Приведение типов:");
        System.out.println("byte : " + d2.byteValue());
        System.out.println("short : " + d2.shortValue());
        System.out.println("int : " + d2.intValue());
        System.out.println("long : " + d2.longValue());
        System.out.println("float : " + d2.floatValue());
        System.out.println("double : " + d2.doubleValue());
        System.out.println("вывод Double: " + d1 + ", " + d2 + ", " + d3);
        String d = Double.toString(d3);
        System.out.println("String " + d);
    }
}
