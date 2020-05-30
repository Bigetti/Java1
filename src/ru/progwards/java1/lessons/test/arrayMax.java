package ru.progwards.java1.lessons.test;

import java.util.Arrays;

public class arrayMax {

    static int[]a = {-4, 3, 0, -6, 55};
    //static int[]a = {};

    //////////////////////////////////////////////////////
    public static void main(String[] args) {
        arrayMax(a);
    }


    /////////////////////////////////////////////////////



    public static int arrayMax(int[] a){

        if (a.length == 0){
            return 0;}
        else {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int lastNum = a[a.length -1];
        System.out.println(lastNum);
            return lastNum;
        }

    }

}
