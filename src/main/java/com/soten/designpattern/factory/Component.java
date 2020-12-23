package com.soten.designpattern.factory;

public interface Component {

    String getComponentName();

    default void use() {
        System.out.println(getComponentName() + " 입니다");
    }

}
