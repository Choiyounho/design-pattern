package com.soten.designpattern.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("날긴 난다");
    }
}
