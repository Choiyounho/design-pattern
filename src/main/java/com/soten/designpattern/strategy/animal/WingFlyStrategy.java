package com.soten.designpattern.strategy.animal;

public class WingFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("날개 짓을 하며 날다");
    }

}
