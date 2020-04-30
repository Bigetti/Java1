package ru.progwards.java1.lessons.compare_if_cycles;

import org.w3c.dom.ls.LSOutput;

public class CyclesGoldenFibo {
    public static void main(String[] args) {

        System.out.println(1 + " -это 1-е по счету число Фибоначчи");
        System.out.println(1 + " -это 2-е по счету число Фибоначчи");
        for (int i = 1; i < 14; i++)
        {
            int x = fiboNumber(i);
        }

        fiboNumber(10);



        int a;
        int b;
        int c;
        for (a = 1; a < 101; a++) {
            for (b = 1; b < 101; b++) {
                for (c = 1; c < 101; c++) {

                    isGoldenTriangle(a, b, c);

                }
            }
        }

        containsDigit(81567657, 6);
    }


    public static int fiboNumber(int n) {
        int a = 1;
        int b = 1;

        int sum_fib = 0;

        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;

        }
        System.out.print(sum_fib);
        System.out.println(" -Число Фибоначчи " + (n + 2) + "по счету");
        return sum_fib;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        final float aa = a;
        final float bb = b;


        if (a == b && (aa / c) > 1.61703 && (aa / c) < 1.61903) {
            System.out.println("есть! Стороны одного из золотых треугольников = " + a + " " + b + " " + c);
            return true;
        } else if (a == c && (aa / b) > 1.61703 && (aa / b) < 1.61903) {
            System.out.println("есть! Стороны одного из золотых треугольников = " + a + " " + b + " " + c);
            return true;
        } else if (b == c && (bb / a) > 1.61703 && (bb / a) < 1.61903) {
            System.out.println("есть! Стороны одного из золотых треугольников = " + a + " " + b + " " + c);
            return true;
        } else {
            return false;
        }
    }

    public static boolean containsDigit(int number, int digit)
    {
        System.out.println("Ищем цифру " + digit + " в числе " + number);
        int celoe = number;
        int b = 10;

        do {
            int zzz = celoe;
            int ostatok = zzz % 10;
            if (ostatok == digit) {
                System.out.println(" цифра " + ostatok + " есть в числе " + number);
                return true;
            } else {
                System.out.println("Пока ищем далее");
                   }
            celoe = celoe/b;
            }
        while (celoe >= 1);

        System.out.println("Net Sovpadeny " + false);
            return false;
    }
}

