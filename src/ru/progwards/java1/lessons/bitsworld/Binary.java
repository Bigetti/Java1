package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    byte num;

    public Binary(byte num){
        this.num = num;
    }

@Override
    public String toString(){
        String result = "";
        int unsignedNum = num & 0b1111_1111;
    for (int i = 0; i < 8; i++) {

        result = ((unsignedNum >> i) & 1) + result;

    }

        return result;
   }

    //////////////////////////////////////
    public static void main(String[] args) {
        Binary number = new Binary((byte) 111);
        System.out.println(number);
        }


}
