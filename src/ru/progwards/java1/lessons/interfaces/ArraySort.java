package ru.progwards.java1.lessons.interfaces;

public class ArraySort {



    public static void sort(CompareWeight[] a){

        CompareWeight exch;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);

            for (int j = i+1; j < len; j++) {
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.GREATER)
                {
                    exch = a[i];
                    a[i] = a[j];
                    a[j] = exch;

                }

            }

        }
    }

    public static void main(String[] args)
    {
        Food[] mas = {new Food(88), new Food(87), new Food(4), new Food(900)};
        sort(mas);
        for (int i=0; i<mas.length; i++)

            System.out.println(mas[i]);


    }

}
