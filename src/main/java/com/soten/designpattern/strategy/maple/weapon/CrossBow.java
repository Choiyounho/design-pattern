package com.soten.designpattern.strategy.maple.weapon;

public class CrossBow implements Weapon {

    @Override
    public void use() {
        System.out.println("석궁으로 싸운다.");
    }

}
