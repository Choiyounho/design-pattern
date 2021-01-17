package com.soten.designpattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        Duck birdAdapter = new BirdAdapter(new WildTurkey());
        birdAdapter.quack();
        birdAdapter.fly();
    }
}
