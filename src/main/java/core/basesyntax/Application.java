package core.basesyntax;

public class Application {
    private static final int MAX_BALL_AMMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[MAX_BALL_AMMOUNT];
        for (int i = 0;i < MAX_BALL_AMMOUNT; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
