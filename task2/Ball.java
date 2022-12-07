package src.ru.mirea.task2;

class Ball {
    private double x = 0.0;
    private double y = 0.0;
    Ball() {

    }
    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    @Override
    public String toString() {
        return ("Ball object:\nx = " + x + "\ny = " + y);
    }
}

