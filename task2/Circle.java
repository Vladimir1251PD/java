package src.ru.mirea.task2;

class Circle {
    private double radius;
    private double length;
    private double area;
    Circle(double radius) {
        this.radius = radius;
        length = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
    }
    void SetRadius(double radius) {
        this.radius = radius;
        length = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
    }
    double getRadius() {
        return radius;
    }
    double getLength(){
        return length;
    }
    double getArea(){
        return area;
    }
}
