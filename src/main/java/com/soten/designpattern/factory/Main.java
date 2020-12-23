package com.soten.designpattern.factory;

public class Main {

    public static void main(String[] args) {
        Component button = ComponentFactory.getComponent(Usage.PRESS);
        button.use();

        Component switchComponent = ComponentFactory.getComponent(Usage.TOGGLE);
        switchComponent.use();

        Component dropdown = ComponentFactory.getComponent(Usage.EXPAND);
        dropdown.use();
    }

}
