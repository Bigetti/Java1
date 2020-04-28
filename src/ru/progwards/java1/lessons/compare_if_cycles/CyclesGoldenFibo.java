package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) 
    {
        System.out.println(1 + " 1-е по счету число Фибоначчи");
        System.out.println(1 + " 2-е по счету число Фибоначчи");
        for (int i = 1; i<14; i++)
        {
            int x = fiboNumber(i);
        }

        //fiboNumber(10);

    }


/*
       public static boolean containsDigit(int number, int digit)
       {

       }
   */
    public static int fiboNumber(int n)
    {
        int a = 1;
        int b = 1;

        int sum_fib = 0;

        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;

            }
        System.out.print(sum_fib);
        System.out.println(" Число Фибоначчи " + (n+2) + "по счету");
        return sum_fib;
    }

    public static boolean isGoldenTriangle(int a, int b, int c)
    {
        if (a == b && a / c > 1.61703 && a / c < 1.61903)
        {
            return true;
        }
        else if (a == c && a / b > 1.61703 && a / b < 1.61903)
        {
           return true;
        }
        else if (b == c && b / a > 1.61703 && b / a < 1.61903)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
