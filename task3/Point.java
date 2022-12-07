package src.ru.mirea.task3;

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
        System.out.printf("x = %.2f  y = %.2f", x, y);
    }
}

class Circle {
   private Point point;
   private double radius;
   private double length;
   Circle() {
       point = new Point();
   }
   Circle(double x, double y, double radius) {
       point = new Point(x, y);
       this.radius = radius;
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
   public void setRadius(double radius) {this.radius = radius; length = 2 * Math.PI * radius;}
   public double getRadius() {return radius;}
    public double getLength() {return length;}
   public void displayInfo() {
       point.displayInfo();
       System.out.printf(" radius = %.2f\n", radius);
   }
}

