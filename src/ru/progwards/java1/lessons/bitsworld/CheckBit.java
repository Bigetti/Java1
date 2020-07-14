package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {

    //////////////////////////////////////////////
    public static void main(String[] args) {


        checkBit((byte) 0b10101110, 4);
    }
/////////////////////////////////////////////


    public static int checkBit(byte value, int bitNumber) {

        int result = 0;
        byte x = (byte) 0b00000001;

//        if (bitNumber == 0) {
//
//             result = value & x;
//
//            if (result % 10 == 1) {
//                result = 1;
//            } else {
//                result = 0;
//            }
//
//        }
         if (bitNumber >= 0 && bitNumber < 8) {
            value = (byte) (value >> bitNumber);
            //System.out.println(value);
            result = (byte) (value & x);

            if (result % 10 == 1) {
                result = 1;
            } else {
                result = 0;
            }
        //return result;
        }
        System.out.println(result);
        return result;


    }
}