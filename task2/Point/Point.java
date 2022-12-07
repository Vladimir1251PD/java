package src.ru.mirea.task2.Point;

    class Point {
    private double x;
    private double y;
    public Point() {
        this(0,0);
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void displayInfo() {
        System.out.printf("x = %.2f  y = %.2f \n", x, y);
    }
}

 class Circle {
    private Point point;
    Circle() {
        point = new Point();
    }
    Circle(double x, double y) {
        point = new Point(x, y);
    }
    public void setX(double x) {
        point.setX(x);
    }
    public void setY(double y) {
        point.setX(y);
    }
    public void setXY(double x, double y) {
        point.setXY(x, y);
    }
    public void displayInfo() {
        point.displayInfo();
    }
}

