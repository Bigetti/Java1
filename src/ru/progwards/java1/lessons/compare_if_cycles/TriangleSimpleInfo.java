package ru.progwards.java1.lessons.compare_if_cycles;

import com.sun.security.jgss.GSSUtil;

public class TriangleSimpleInfo {

    public static void main(String[] args){

        minSide(99,99,10);
        maxSide(99,99,10);
        isEquilateralTriangle(99,99,10);
    }



    public static int maxSide(int a, int b, int c)
    {
        if (a >= b && a >= c)
        {
            System.out.println("сторона а наибольшая и равна " + a);
            return a;
        }
        else if (b >= a && b >= c)
        {
            System.out.println("сторона b наибольшая и равна " + b);
            return b;
        }
        else {
            System.out.println("сторона c наибольшая и равна " + c);
            return c;
        }
    }

    public static int minSide(int a, int b, int c)
    {
        if (a <= b && a <= c)
        {
            System.out.println("сторона а наименьшая и равна " + a);
            return a;
        }
        else if (b <= a && b <= c)
        {
            System.out.println("сторона b наименьшая и равна и равна " + b);
            return b;
        }
        else {
            System.out.println("сторона c наименьшая и равна и равна " + c);
            return c;
        }
    }

    public static boolean isEquilateralTriangle(int a, int b, int c)
    {
        if (a == b && b == c)
        {
            System.out.println("this is ravnostoronny triangle");
            return true;
        }
        else {
            System.out.println("this is NOT ravnostoronny triangle");
            return false;
        }
    }

}
