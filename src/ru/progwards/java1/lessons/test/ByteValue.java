package ru.progwards.java1.lessons.test;

public class ByteValue {

    static byte value = (byte) 0b11101;

    ///////////////////////
    public static void main(String[] args) {

//        int result;
//        byte x = (byte) 0b11111111;
//        int res = value & x;
//        System.out.println(x);
//        System.out.println(value);
//        System.out.println(res);
//        String z = (Integer.toBinaryString(res));
//        System.out.println(z);
//        int num = Integer.parseInt(z);
//        System.out.println(num);


        byte x = (byte) 0b00000001;
        int result = value & x;


        if (result % 10 == 1){
            result = 1;}

        else
        {result = 0;}


        System.out.println(result);

    }
    ////////////////////////////////
}
