package com.example.ArithmeticSpring.domain;

public class Division {
    private int num7;
    private int num8;

    public int getNum7() {
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getNum8() {
        return num8;
    }

    public void setNum8(int num8) {
        this.num8 = num8;
    }

    public int divide() {
        return num7/num8;
    }
}
