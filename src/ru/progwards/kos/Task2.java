package ru.progwards.kos;

public class Task2 {


    public static void printJava()
    {
        String n1 = "Хорошо идут дела";
        String n2 = "Изучаю Java я!";
        String n3 = " ";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 + n3 + n2);
        System.out.println(n2 + n3 + n1);

    }

    public static int subtraction(int x, int y)
    {
       // x = 7;
        //y = 4;
        System.out.println("Вызвана функция subtraction() с параметрами x = " + x + ", y = " + y);
        int z = x -y;
        return z;
    }

    public static int addition(int x, int y)
    {
        //int x;
        //int y;
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        int z = x + y;
        return z;
    }

    public static int multiplication(int x, int y)
    {
        //int x;
        //int y;
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = " + y);
        int z = x * y;
        return z;
    }

    public static void calculation()
    {
        int a = 34;
        int b = 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = addition(a,b);
        System.out.println("a + b = " + c);
        c = subtraction(a,b);
        System.out.println("a - b = " + c);
        c = multiplication(a,b);
        System.out.println("a * b = " + c);

    }


    public static void main(String[] args)
    {
        printJava();
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);

        multiplication(124,87);
        multiplication(1528,3);
        //calculation();
    }
}
