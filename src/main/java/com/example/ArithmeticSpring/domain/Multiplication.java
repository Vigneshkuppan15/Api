package com.example.ArithmeticSpring.domain;

public class Multiplication {
    private int num5;
    private int num6;

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public int product() {
        return num5*num6;
    }

}
