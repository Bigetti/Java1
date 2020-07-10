package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    byte num;

    //////////////////////////////////////
    public static void main(String[] args) {

        Binary number = new Binary((byte) 123);
        System.out.println(number);


    }
    ////////////////////////////////////////


    public Binary(byte num){
        this.num = num;
    }

@Override
    public String toString(){


        return "num = " + Integer.toBinaryString(num);
    }


}
