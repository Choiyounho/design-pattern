package com.soten.designpattern.state;

public class ModeStateLight implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("다크 모드로 변환");
        modeSwitch.setModeState(new ModeStateDark());
    }

}
