package com.soten.designpattern.state;

public class ModeSwitch {

    private ModeState modeState;

    public ModeSwitch() {
        modeState = new ModeStateLight();
    }

    public void setModeState(ModeState modeState) {
        this.modeState = modeState;
    }

    public void toggle() {
        modeState.toggle(this);
    }

}
