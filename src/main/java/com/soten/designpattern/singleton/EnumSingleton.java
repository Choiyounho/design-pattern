package com.soten.designpattern.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
