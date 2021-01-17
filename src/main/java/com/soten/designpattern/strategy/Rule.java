package com.soten.designpattern.strategy;

public class Rule {

    /**
     * 숫자가 4이상이면 True, 4 미만이면 False를 리턴하는 메서드를 만들어라.
     */
    public static boolean getRule(int condition) {
        return condition > 3;
    }

}
