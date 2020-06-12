package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    private int[] mass1 = {4, 6, 77, 22 ,-1};

    static int num = 44;
    static int pos;

    //////////////////////////////////////////////////////
    public static void main(String[] args) {

        DIntArray mass = new DIntArray();

        System.out.println("Длина массива первоначальная " + mass.mass1.length);
        System.out.println("Первоначальный массив " + Arrays.toString(mass.mass1));
        mass.add(num);
        System.out.println("Массив после добавления элемента нум " + Arrays.toString(mass.mass1));

        System.out.println("Длина массива после добавления элемента нум " + mass.mass1.length);

        mass.atInsert(pos,num);
        System.out.println("Длина массива после добавления элемента нум в позицию пос " + mass.mass1.length);
        System.out.println("Массив после добавления элемента нум в позицию ПОС " + Arrays.toString(mass.mass1));
        //System.out.println(" Номер элемента ПОС " + pos);
        //System.out.println("Значение элемента ПОС " + mass.mass1[pos]);
        mass.atDelete(pos);
        mass.at(2);


    }
    //////////////////////////////////////////////////////

    public DIntArray(){
        this.mass1 = mass1;
        }


    public void add(int num){

        int[] mass2 = Arrays.copyOf(mass1,mass1.length + 1);
        mass2[mass2.length - 1]  = num;
        mass1 = mass2;

    }


    //
    public void atInsert(int pos, int num){
        int[] mass3 = Arrays.copyOf(mass1,mass1.length + 1);
        pos = (mass3.length)/2;

        System.out.println("Номер элемента ПОС " + pos);
        mass3[mass3.length - 1 ] = mass3[pos];
        mass3[pos] = num;
        System.out.println("Значение элемента ПОС " + mass3[pos]);
        mass1 = mass3;

    }

    public void atDelete(int pos){

        pos = mass1.length/2;
        mass1[pos] = mass1[mass1.length - 1];
        int[] mass4 = Arrays.copyOf(mass1, mass1.length - 1);
        mass1 = mass4;
        //System.out.println(pos);
        //System.out.println(mass1[pos]);
        //System.out.println(Arrays.toString(mass1));
        System.out.println("Массив после удаления элемента в позиции ПОС " + Arrays.toString(mass4));
    }

    public int at(int pos){

        System.out.println("Значение элемента в индексе ПОС = " + mass1[pos]);
        return mass1[pos];

    }

}
