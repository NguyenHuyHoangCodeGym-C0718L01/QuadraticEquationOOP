package com.company;

public class QuadraticEquation {
    private double a,b,c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return ((b*b)-(4*a*c));
    }

    public double getRoot1(){
        boolean checkDiscriminant = getDiscriminant() >= 0;
        if(checkDiscriminant){
            return (-b + Math.pow(getDiscriminant(), 0.5))/(2*a);
        }else{
            return 0;
        }
    }

    public double getRoot2(){
        boolean checkDiscriminant = getDiscriminant() >= 0;
        if(checkDiscriminant){
            return (-b - Math.pow(getDiscriminant(), 0.5))/(2*a);
        }else{
            return 0;
        }
    }
}
