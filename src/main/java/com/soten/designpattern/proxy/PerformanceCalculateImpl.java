package com.soten.designpattern.proxy;

public class PerformanceCalculateImpl implements Calculate {

    private final Calculate calculate = new CalculateImpl();

    @Override
    public void apply() {
        System.out.println("performance start");
        long current = System.nanoTime();
        calculate.apply();
        long end = System.nanoTime() - current;
        System.out.println("performance end : " + end);
    }

}
