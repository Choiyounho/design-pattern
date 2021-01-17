package com.soten.designpattern.strategy.maple.job;

import com.soten.designpattern.strategy.maple.weapon.Weapon;

public class Archer {

    private final String name;
    private final Weapon weapon;

    public Archer(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void hunt() {
        System.out.println(this.name + "는");
        weapon.use();
    }

}
