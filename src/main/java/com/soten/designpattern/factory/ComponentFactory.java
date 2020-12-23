package com.soten.designpattern.factory;

public class ComponentFactory {

    private ComponentFactory() {
    }

    public static Component getComponent(Usage usage) {
        if (usage.equals(Usage.PRESS)) {
            return new Button();
        }
        if (usage.equals(Usage.TOGGLE)) {
            return new Switch();
        }
        if (usage.equals(Usage.EXPAND)) {
            return new Dropdown();
        }
        throw new IllegalArgumentException("잘못된 사용 방법입니다.");
    }

}
