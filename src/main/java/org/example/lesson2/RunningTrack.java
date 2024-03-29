package org.example.lesson2;

public class RunningTrack implements Move  {
    private int distance;
    private int codeOfLet;

    @Override
    public int getCodeOfLet() {
        codeOfLet = 0;
        return codeOfLet;
    }

    public RunningTrack(int distance) {
        this.distance = distance;
        this.codeOfLet = getCodeOfLet();
    }

    @Override
    public boolean moveRun(Move move) {
        return false;
    }

    @Override
    public boolean moveJump(Move move) {
        return false;
    }

    @Override
    public int getDistanceLet() {
        return distance;
    }
}