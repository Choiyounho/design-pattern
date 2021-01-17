package com.soten.designpattern.strategy.animal;

public class DuckTest {

    public static void main(String[] args) {

        Duck duck = new Duck(new RocketFlyStrategy());

        duck.fly();
    }

}
