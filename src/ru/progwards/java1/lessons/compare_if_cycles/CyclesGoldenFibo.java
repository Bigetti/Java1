package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {


    private static CacheInfo lastFibo;


    public static class CacheInfo {
        public int n;
        public int fibo;
    }


    public static CacheInfo getLastFibo() {
        return lastFibo;
    }

    public static CacheInfo clearLastFibo(){
        return lastFibo = null;
    }

    public static void main(String[] args) {



        for (int i = 1; i < 14; i++)
        {
            int fibo = fiboNumber(i);

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

        containsDigit(8106765, 0);
    }


    public static int fiboNumber(int n) {

     /*   if (n == lastFibo)
        {
            return ;
        }*/

        if (n == 1 || n == 2)

        {
            System.out.println("1 -Число Фибоначчи " + (n) + "по счету");
            return 1;
        }

        else {
            int a = 1;
            int b = 1;
            int lastFibo = 0;
            for (int i = 2; i < n; i++) {
                lastFibo = a + b;
                a = b;
                b = lastFibo;

            }
            System.out.print(lastFibo);
            System.out.println(" -Число Фибоначчи " + (n) + "по счету");
            return lastFibo;
        }
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
            int ostatok = celoe % 10;
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

