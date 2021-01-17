package com.soten.designpattern.strategy.maple.job;

import com.soten.designpattern.strategy.maple.weapon.Weapon;

public class BowMaster extends Archer {

    public BowMaster(Weapon weapon) {
        super("보우마스터", weapon);
    }

}
