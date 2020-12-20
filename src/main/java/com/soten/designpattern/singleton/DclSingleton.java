package com.soten.designpattern.singleton;

// Double Checking Locking Singleton
public class DclSingleton {

    private volatile static DclSingleton dclSingleton;

    private DclSingleton(){
    }

    public static DclSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DclSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DclSingleton();
                }
            }
        }
        return dclSingleton;
    }

}
