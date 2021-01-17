package com.soten.designpattern.strategy.transfer;

public class RailLoadStrategy implements MovableStrategy {

    @Override
    public void move() {
        System.out.println("선로로 이동한다.");
    }

}
