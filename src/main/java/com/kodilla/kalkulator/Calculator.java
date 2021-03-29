package com.kodilla.kalkulator;

public class Calculator {
    int a;
    int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addAToB () {
        System.out.println("Wynik dodawania to "+(a+b));
    }

    public void multiplyAAndB (){
        System.out.println("Wynik mnożenia to "+(a*b));
    }


}
