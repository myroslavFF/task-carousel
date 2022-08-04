package com.epam.rd.autotasks;

public class CountDownTask implements Task{
    private int value;
    private boolean isComp = false;
    public CountDownTask(int value) {
        this.value = value;
        if (value <= 0){
            this.value = 0;
            isComp = true;
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public void execute() {
        value--;
        if (value <= 0){
            isComp = true;
            value = 0;
        }
    }

    @Override
    public boolean isFinished() {
        return isComp;
    }

}
