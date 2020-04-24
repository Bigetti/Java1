package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static void main(String[] args)
    {
        //sphereSquare(2.2);
        //earthSquare();
        //mercurySquare();
        //jupiterSquare();
        earthVsMercury();
        earthVsJupiter();

    }

    public static Double sphereSquare(Double r)
    {
        double p = 3.14;
        //double r;
        double S = 4*p*r*r;
        //System.out.println(S);
        return S;
    }

    public static Double earthSquare()
    {
        double Earth = sphereSquare(6371.2);
        //System.out.println("Площадь Земли =" + Earth);
        return Earth;
    }

    public static Double mercurySquare()
    {
        double Mercury = sphereSquare(2439.7);
        //System.out.println(Earth);
        return Mercury;
    }

    public static Double jupiterSquare()
    {
        double Jupiter = sphereSquare(71492.0);
        return Jupiter;
    }

    public static Double earthVsMercury(){
        double earth = earthSquare();
        System.out.println("Площадь Земли =" + earth);
        double mercury = mercurySquare();
        System.out.println("Площадь Меркурия =" + mercury);
        double EM = earth/mercury;
        System.out.println("Отношение земли к меркурию" + "=" + EM);
        return EM;
    }

    public static Double earthVsJupiter(){
        double earth = earthSquare();
        double jupiter = jupiterSquare();
        System.out.println("Площадь Юпитера =" + jupiter);
        double EJ = earth/jupiter;
        System.out.println("Отношение земли к Юпитеру" + "=" + EJ);
        return EJ;
    }

}
