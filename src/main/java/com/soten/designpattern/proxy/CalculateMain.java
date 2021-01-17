package com.soten.designpattern.proxy;

public class CalculateMain {

    public static void main(String[] args) {
        Calculate calculate = new PerformanceCalculateImpl();

        calculate.apply();
    }
}
