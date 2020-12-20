package com.soten.designpattern.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (lazy == null) {
            return new LazySingleton();
        }
        return lazy;
    }

}
