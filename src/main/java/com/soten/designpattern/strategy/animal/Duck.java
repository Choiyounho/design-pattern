package com.soten.designpattern.strategy.animal;

public class Duck {

    private FlyStrategy flyStrategy;

    public Duck(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly() {
        System.out.print("오리가 : ");
        flyStrategy.fly();
    }

}
