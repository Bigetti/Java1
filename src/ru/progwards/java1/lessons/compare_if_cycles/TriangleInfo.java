package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {

    public static void main(String[] args)
    {
        isTriangle(99,99,10);
        isRightTriangle(5, 12,13);
        isIsoscelesTriangle(4,9,5);
    }


    public static boolean isIsoscelesTriangle(int a, int b, int c)
    {
     if (a == b || b == c || a == c)
     {
         System.out.println("ravnobedrenny triangle");
         return true;
     }
     else
     {
         System.out.println("NOT ravnobedrenny triangle");
         return false;
     }

    }



    public static boolean isRightTriangle(int a, int b, int c)
    {
        if (a*a == (c*c + b*b) || b*b == (a*a + c*c) || c*c == (a*a + b*b))
        {
            System.out.println("pryamougolny triangle");
            return true;
        }
        else
        {

            System.out.println("NOT pryamougolny triangle");
            return false;
        }
    }




    public static boolean isTriangle(int a, int b, int c)
    {
        if (a < b + c && b < a + c && c < a + b)
        {
            System.out.println("you can make a triangle");
            return true;
        }
        else
        {
            System.out.println("you can NOT make a triangle");
            return false;
        }
    }

}
