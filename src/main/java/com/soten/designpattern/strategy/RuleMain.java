package com.soten.designpattern.strategy;

import java.util.concurrent.ThreadLocalRandom;

public class RuleMain {

    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    //ThreadLocalRandom.current().nextInt(1,100);
    public static void main(String[] args) {
        int condition = random.nextInt(10);
        boolean result = Rule.getRule(condition);

        System.out.println(result);
    }

}
