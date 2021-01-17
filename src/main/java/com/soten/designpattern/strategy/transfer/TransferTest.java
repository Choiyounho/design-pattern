package com.soten.designpattern.strategy.transfer;

public class TransferTest {

    public static void main(String[] args) {
        Moving train = new Train(new RailLoadStrategy());
        Moving bus = new Bus(new LoadStrategy());

        train.move();
        bus.move();

        Moving railBus = new Bus(new RailLoadStrategy());
        railBus.move();
    }
}
