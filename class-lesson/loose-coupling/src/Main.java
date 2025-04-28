
public class Main {
    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}