package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 3 , 1);
        checkRoot(quadraticEquation.getRoot1(), quadraticEquation.getRoot2());

        QuadraticEquation quadraticEquation1 = new QuadraticEquation(1,2,1);
        checkRoot(quadraticEquation1.getRoot1(), quadraticEquation1.getRoot2());

        QuadraticEquation quadraticEquation2 = new QuadraticEquation(1,2,3);
        checkRoot(quadraticEquation2.getRoot1(), quadraticEquation2.getRoot2());
    }

    public static void checkRoot(double a, double b){
        if(a==b){
            if(a==0){
                System.out.println("The equation has no roots");
            }else{
                System.out.println("The root: "+ a);
            }
        }else{
            System.out.println("The root 1: "+a+", the root 2: "+b);
        }
    }
}
