package src.ru.mirea.task7;

public class MovableRectangle implements Movable{
    class MovablePoint implements Movable {
        float x;
        float y;
        float speed;
        public MovablePoint() {
            this.x = 0;
            this.y = 0;
            this.speed = 0;
        }

        public MovablePoint(float x, float y,float speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        @Override
        public void moveUP() {
            this.y += speed;
        }

        @Override
        public void moveDOWN() {
            this.y -= speed;
        }

        @Override
        public void moveLEFT() {
            this.x -= speed;
        }

        @Override
        public void moveRIGHT() {
            this.x += speed;
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", speed=" + speed +
                    '}';
        }
    }
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(float x1, float y1, float speed1, float x2, float y2, float speed2) {
        this.topLeft = new MovablePoint(x1,y1,speed1);
        this.bottomRight = new MovablePoint(x2,y2,speed2);
    }

    @Override
    public void moveUP() {
        topLeft.moveUP();
        bottomRight.moveUP();
    }

    @Override
    public void moveDOWN() {
        topLeft.moveDOWN();
        bottomRight.moveDOWN();
    }

    @Override
    public void moveLEFT() {
        topLeft.moveLEFT();
        bottomRight.moveLEFT();
    }

    @Override
    public void moveRIGHT() {
        topLeft.moveRIGHT();
        bottomRight.moveRIGHT();
    }
    public boolean SpeedTest() {
        if (topLeft.speed == bottomRight.speed) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "\ntopLeft:\n" + topLeft.toString() +
                "\nbottomRight:\n" + bottomRight.toString()  +
                '}';
    }
}