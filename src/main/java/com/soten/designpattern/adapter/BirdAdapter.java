package com.soten.designpattern.adapter;

public class BirdAdapter implements Duck {

    private Turkey turkey;

    public BirdAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
