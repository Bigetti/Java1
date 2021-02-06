/*Задача 2. Класс CalculateFibonacci
        Задача на динамическое программирование. Это когда некоторые результаты сохраняются для
        последующего использования.
        Для функции public static int fiboNumber(int n) из задачи 3 урока 4 сделать сохранение одного,
        последнего из рассчитанных значений. Для этого

        2.1 Разместить в классе CalculateFibonacci функцию
public static int fiboNumber(int n)

        2.2 Разместить вложенный класс
public static class CacheInfo, содержащий пару свойств
        public int n - число, для которого рассчитываем Фибоначчи
public int fibo - результат расчета
        2.3 Разместить в классе CalculateFibonacci приватную статическую переменную CacheInfo lastFibo;

        2.4 В статической функции fiboNumber, проверять параметр n на совпадение с последним рассчитанным значением,
         и если совпадает - возвращать уже готовый результат. Если не совпадает - рассчитывать и сохранять
         в статической переменной lastFibo.

        2.5 Реализовать метод public static CacheInfo getLastFibo() который возвращает lastFibo

        2.6 Реализовать метод public static void clearLastFibo(), который сбрасывает lastFibo в null*/


package ru.progwards.java1.lessons.interfaces;

/*
import javax.naming.Name;

public class CalculateFibonacci {

    private static CacheInfo lastFibo;

    public static class CacheInfo {
        public int n;
        public int fibo;

        @Override
        public String toString() {
            return "CacheInfo{" +
                    "n=" + n +
                    ", fibo=" + fibo +
                    '}';
        }
    }


    public static CacheInfo getLastFibo() {
        return lastFibo;
    }

    public static void clearLastFibo() {
        lastFibo = null;

    }



    ///////////////////////////////////////////////////////////
    public static void main(String[] args) {


        for (int i = 1; i < 14; i++) {
            int fibo = fiboNumber(i);
        }

        fiboNumber(1);
        CacheInfo one = new CacheInfo();
        System.out.println(one);
        clearLastFibo();
        System.out.println(fiboNumber(6));
        System.out.println(fiboNumber(9));
        System.out.println(fiboNumber(1));
        System.out.println(new CacheInfo());
    }
        

//////////////////////////////////////////////////////////////

    public static int fiboNumber(int n) {

        if (getLastFibo() == null)
        {
            lastFibo = new CacheInfo();
        }
        if (lastFibo.n == n){
            return lastFibo.fibo;
        }


        if (n == 1 || n == 2)

        {
            System.out.println("1 -Число Фибоначчи " + (n) + "по счету");
            return 1;
        }

        else {
            int a = 1;
            int b = 1;
            int sum = 0;
            for (int i = 2; i < n; i++) {
                sum = a + b;
                a = b;
                b = sum;

            }
            System.out.print(sum);
            System.out.println(" -Число Фибоначчи " + (n) + "по счету");
            lastFibo.fibo = sum;
            lastFibo.n = n;
            return sum;
        }
    }
}
*/
public class CalculateFibonacci
{
    //проверять параметр n на совпадение с последним рассчитанным значением,
// и если совпадает - возвращать уже готовый результат.
// Если не совпадает - рассчитывать и сохранять в статической переменной lastFibo.
    public static int fiboNumber(int n)
//  будет возвращать n-ое число Фибоначчи (нумерация начинается с 1,
//  то есть при n = 3 должно вернуться число Фибоначчи 2, а при n = 10 число 55).
    {
//если вложенный класс ещё не создан -  создать
        if (getLastFibo() == null)
            lastFibo = new CacheInfo();

//если уже рассчино - просто вернуть
        if (n == lastFibo.n)
        {
            System.out.println("calced");
            return lastFibo.fibo;
        }

        lastFibo.n = n;

        if (n < 3)
        {
            lastFibo.fibo = 1;
            return 1;
        }

//складываем два предыдущих, и запоминаем рез-т  и предпоследнее значение
        int f0 = 1, f1 = 1, f2 = 0;

        for (int i = 3; i <= n; i++)
        {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }

        lastFibo.fibo = f2;
        return f2;
    }

    //вложенный класс. Содержит переменные
    public static class CacheInfo
    {
        public int n;    // -число,  для которого  рассчитываем Фибоначчи
        public int fibo; // -  результат расчета
    }

    //ссылка на вложенный класс
    private static CacheInfo lastFibo;

    public static CacheInfo getLastFibo()
    {
        return lastFibo;
    }

    public static void clearLastFibo()
    {
        lastFibo = null;
    }

    public static void main(String[] args)
    {
        System.out.println(fiboNumber(9));
        System.out.println(fiboNumber(9));
        System.out.println(fiboNumber(1));
        System.out.println(new CacheInfo());
    }
}