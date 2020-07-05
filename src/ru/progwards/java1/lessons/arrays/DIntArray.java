package ru.progwards.java1.lessons.arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class DIntArray {

    private int[] mass1 = {};

    static int num;
    static int pos;

    //////////////////////////////////////////////////////
    public static void main(String[] args) {

        DIntArray mass = new DIntArray();

        System.out.println("Длина массива первоначальная " + mass.mass1.length);
        System.out.println("Первоначальный массив " + Arrays.toString(mass.mass1));
        mass.add(55);
        mass.add(22);
        System.out.println(" Тест заполнения массива " + Arrays.toString(mass.mass1));
        mass.add(1);
        mass.add(23);
        mass.add(-2);
        mass.add(345);

        System.out.println("Массив после добавления элеменов нум " + Arrays.toString(mass.mass1));


        System.out.println("Длина массива после добавления элементов нум " + mass.mass1.length);

        mass.atInsert(4,77);
        System.out.println("Длина массива после добавления элемента нум в позицию пос " + mass.mass1.length);
        System.out.println("Массив после добавления элемента нум в позицию ПОС " + Arrays.toString(mass.mass1));
        //System.out.println(" Номер элемента ПОС " + pos);
        //System.out.println("Значение элемента ПОС " + mass.mass1[pos]);
        mass.atDelete(2);
        mass.at(2);


    }
    //////////////////////////////////////////////////////

    public DIntArray(){
    }


    public void add(int num){

        int[] mass2 = Arrays.copyOf(mass1,mass1.length + 1);
        mass2[mass2.length - 1]  = num;
        mass1 = mass2;

    }


    //
    public void atInsert(int pos, int num){
        int[] mass3 = new int[mass1.length + 1];
        System.out.println("Тест метода ИНСЕРТ -- " + Arrays.toString(mass1));
        System.arraycopy(mass1, 0, mass3, 0, pos);
        System.out.println("Тест метода ИНСЕРТ -- " + Arrays.toString(mass3));
        mass3[pos] = num;
        System.out.println("Тест метода ИНСЕРТ -- " + Arrays.toString(mass3));
        System.arraycopy(mass1, pos, mass3, pos + 1, mass1.length - pos);
        System.out.println("Тест метода ИНСЕРТ -- " + Arrays.toString(mass3));

        System.out.println("Тест метода ИНСЕРТ -- Номер элемента ПОС " + pos);

        System.out.println("Тест метода ИНСЕРТ -- Значение элемента ПОС " + mass3[pos]);
        mass1 = mass3;

    }

    public void atDelete(int pos){


        int[] mass4 = new int[mass1.length - 1];
        System.out.println("Тест метода ДЕЛ -- Выведем массив1 " + Arrays.toString(mass1));
        System.out.println("Тест метода ДЕЛ -- Выводим Маасив4 " + Arrays.toString(mass4));
        System.arraycopy(mass1, 0, mass4, 0, pos);
        System.out.println("Тест метода ДЕЛ -- Скопировали первую часть до ПОС " + Arrays.toString(mass4));
        System.arraycopy(mass1, pos+1, mass4, pos, mass4.length - pos);
        System.out.println("Тест метода ДЕЛ -- Скопировали вторую часть, минуя ПОС " + Arrays.toString(mass4));
        mass1 = mass4;
        System.out.println("Тест метода ДЕЛ -- Массив после удаления элемента в позиции ПОС " + Arrays.toString(mass4));
    }

    public int at(int pos){

        System.out.println("Значение элемента в индексе ПОС = " + mass1[pos]);
        return mass1[pos];

    }

}
