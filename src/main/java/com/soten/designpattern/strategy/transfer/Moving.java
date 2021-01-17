package com.soten.designpattern.strategy.transfer;

public class Moving {

    private final MovableStrategy movableStrategy;

    public Moving(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        movableStrategy.move();
    }

}
