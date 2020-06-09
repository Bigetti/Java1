package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    private int[] mass1;
    private int[] mass2;
    private int num = 111;




    //////////////////////////////////////////////////////
    public static void main(String[] args) {
        int[] mass1 = new int[]{4, 6, 77, 22 ,-1};
        int[] mass2 = Arrays.copyOf(mass1,mass1.length + 1);
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        System.out.println(mass1.length);
        System.out.println(mass2.length);

 //       mass2[mass2.length]  = 8;

        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));



    }
    //////////////////////////////////////////////////////

    public DIntArray(int[] mass1){

        this.mass1 = mass1;
        //this.mass2 = mass2;
    }


    public void add() {
        add();
    }

    public void add(int num){
        mass2[mass2.length]  = num;

    }


    //
//    public void atInsert(int pos, int num){
//
//    }
//
//    public void atDelete(int pos){
//
//    }
//
//    public int at(int pos){
//      return ;
//    }

}
