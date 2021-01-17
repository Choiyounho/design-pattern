package com.soten.designpattern.proxy;

public class CalculateImpl implements Calculate {

    @Override
    public void apply() {
        int number = 0;

        for (int i = 0; i < 1000; i++) {
            number = i + 1;
        }
        System.out.println(number);
    }

}
