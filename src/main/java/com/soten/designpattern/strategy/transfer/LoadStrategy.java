package com.soten.designpattern.strategy.transfer;

public class LoadStrategy implements MovableStrategy {

    @Override
    public void move() {
        System.out.println("도로로 이동한다.");
    }

}
