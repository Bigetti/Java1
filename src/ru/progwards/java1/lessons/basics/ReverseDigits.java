package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static void main(String[] args)
    {
        reverseDigits(9999);
    }

    public static int reverseDigits(int number)
    {
        if (100<=number&&number<=999)
        {
            int x = number/100;
            int y = number/10 -x*10;
            int z = number%10;
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            String a = Integer.toString(x);
            String b = Integer.toString(y);
            String c = Integer.toString(z);

            String text = (c + b + a);
            System.out.println(text);
            int fin = Integer.parseInt (text);
            System.out.println(fin);
            return fin;

        }
        else
        {
            System.out.println("Incorrect number");
            return 0;
        }

    }
}
