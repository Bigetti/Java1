package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    ///////////////////////////////////////
    public static void main(String[] args) {

        //sumBits((byte) 00001001);
        System.out.println(sumBits((byte) 0b11100111));

    }
    ///////////////////////////////////////


    public static int sumBits(byte value) {

        int sum = 0;
        int sum2 = 0;
        byte res = 0;
        byte x = (byte) 0b00000001;

        int result = value & x;

        if (result % 10 == 1){
            result = 1;}

        else
        {result = 0;}

        sum += result;



        for (int i = 1; i < 8; i++ ) {
            value = (byte) (value >> 1);
            //System.out.println(value);
            res = (byte) (value & x);

            if (res % 10 == 1){
                res = 1;}

            else
            {res = 0;}
            sum2 += res;
        }




        return sum + sum2;
    }
}
