package com.dci.intro;

import org.springframework.stereotype.Component;

//@Component
public class Pacman implements Game {

    public void up(){
        System.out.println("Pacman up");
    }

    public void down(){
        System.out.println("down");
    }

    public void left(){
        System.out.println("Left");
    }

    public void right(){
        System.out.println("Right");
    }
}
