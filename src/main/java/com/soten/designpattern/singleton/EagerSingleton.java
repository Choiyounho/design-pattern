package com.soten.designpattern.singleton;

public class EagerSingleton {

    private static EagerSingleton eager;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        if (eager == null) {
            eager = new EagerSingleton();
        }
        return eager;
    }

}
