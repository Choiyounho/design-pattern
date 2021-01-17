package com.soten.designpattern.strategy.transfer;

public class Train extends Moving {

    public Train(MovableStrategy movableStrategy) {
        super(movableStrategy);
    }
}
