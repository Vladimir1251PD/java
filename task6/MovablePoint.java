package src.ru.mirea.task6;

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint {x: " + x +
                " y: " + y +
                " xSpeed: " + xSpeed +
                " ySpeed: " + ySpeed;
    }

    public void moveUp() {
        y+= ySpeed;
    }

    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
    public void moveRight() {
        x+=xSpeed;
    }
}

class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "MovableCircle {x: " + x +
                " y: " + y +
                " xSpeed: " + xSpeed +
                " ySpeed: " + ySpeed +
                " radius: " + radius;
    }
}