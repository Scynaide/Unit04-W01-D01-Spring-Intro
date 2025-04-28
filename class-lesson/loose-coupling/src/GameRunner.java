public class GameRunner {

    private Game game;

    public GameRunner(Game game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.left();
        game.right();
        game.down();
    }
}
