package src.ru.mirea.task2;

public class BallTest {
    public static void main(String[] args) {
        Ball newBall = new Ball();
        newBall.move(13.75, -0.99);
        System.out.println(newBall.toString());
    }
}
