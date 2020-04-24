package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static void main(String[] args){
        sphereSquare(2.2);

    }


    public static Double sphereSquare(Double r){
        double p = 3.14;
        //double r;
        double S = 4*p*r*r;

        System.out.println(S);
        return S;
    }


}
