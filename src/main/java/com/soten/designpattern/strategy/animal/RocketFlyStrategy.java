package com.soten.designpattern.strategy.animal;

public class RocketFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("로켓으로 날다");
    }
}
