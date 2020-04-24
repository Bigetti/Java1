package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static void main(String[] args)
    {
        sphereSquare(2.2);
        earthSquare();
    }


    public static Double sphereSquare(Double r)
    {
        double p = 3.14;
        //double r;
        double S = 4*p*r*r;

        System.out.println(S);
        return S;
    }


    public static Double earthSquare()
    {
        double Earth = sphereSquare(6371.2);
        System.out.println(Earth);
        return Earth;
    }


}
