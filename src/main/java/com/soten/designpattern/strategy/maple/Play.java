package com.soten.designpattern.strategy.maple;

import com.soten.designpattern.strategy.maple.job.Archer;
import com.soten.designpattern.strategy.maple.job.BowMaster;
import com.soten.designpattern.strategy.maple.job.CrossBowMaster;
import com.soten.designpattern.strategy.maple.weapon.Bow;
import com.soten.designpattern.strategy.maple.weapon.CrossBow;

public class Play {

    public static void main(String[] args) {
        Archer archer = new Archer("아처", new Bow());
        archer.hunt();

        System.out.println();

        Archer bowMaster = new BowMaster(new Bow());
        bowMaster.hunt();

        System.out.println();

        Archer crossBowMaster = new CrossBowMaster(new CrossBow());
        crossBowMaster.hunt();
    }
}
