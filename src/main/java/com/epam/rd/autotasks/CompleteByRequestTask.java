package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean isComp ;
    private boolean flag;

    @Override
    public void execute() {
        isComp = flag;
    }

    @Override
    public boolean isFinished() {
        return isComp;
    }

    public void complete() {
        flag = true;
    }
}
