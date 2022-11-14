package com.example.ArithmeticSpring.domain;

public class Subtraction {
    private int num3;
    private int num4;

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }
    public int difference() {
        return num3-num4;
    }
}
