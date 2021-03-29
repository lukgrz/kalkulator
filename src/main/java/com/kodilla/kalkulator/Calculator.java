package com.kodilla.kalkulator;

public class Calculator {
    int a;
    int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addAToB () {
        return a+b;
    }

    public int multiplyAAndB (){
        return a*b;
    }
}
