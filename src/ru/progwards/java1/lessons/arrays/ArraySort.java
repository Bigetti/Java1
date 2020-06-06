package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {

    static int[] a = {33, 4, -3, 43, 2, 12, 222, 345, 4, 55, 65, 4};



    ///////////////////////////////////////////
    public static void main(String[] args) {

        sort(a);
        System.out.println(Arrays.toString(a));
    }
    ///////////////////////////////////////////

    public ArraySort(){
        this.a = a;
        sort(a);
    }

    public static void sort(int[] a){

        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.println();
            int exch = 0;
            for (int j = i+1; j < len; j++) {
                if (a[i] > a[j]){
                    exch = a[i];
                    a[i] = a[j];
                    a[j] = exch;

                }

            }
            
        }
    }
}
