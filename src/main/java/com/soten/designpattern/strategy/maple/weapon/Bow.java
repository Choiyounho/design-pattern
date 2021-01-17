package com.soten.designpattern.strategy.maple.weapon;

public class Bow implements Weapon {

    @Override
    public void use() {
        System.out.println("활로 싸운다");
    }

}
