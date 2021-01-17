package com.soten.designpattern.state;

public class SwitchMain {

    public static void main(String[] args) {
        ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.toggle();
        modeSwitch.toggle();
        modeSwitch.toggle();
        modeSwitch.toggle();
        modeSwitch.toggle();
        modeSwitch.toggle();
    }

}
