package com.dci.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    Game game;

    public GameRunner(Game game){
        this.game = game;
    }


    public void run(){
        game.up();
        game.down();
        game.right();
        game.left();
    }

}
