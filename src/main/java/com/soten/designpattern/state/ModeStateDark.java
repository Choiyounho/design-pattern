package com.soten.designpattern.state;

public class ModeStateDark implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("라이트 모드로 변환");
        modeSwitch.setModeState(new ModeStateLight());
    }

}
