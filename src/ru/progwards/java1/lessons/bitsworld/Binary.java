package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    byte num;

    public Binary(byte num){
        this.num = num;
    }

@Override
    public String toString(){
        int numer1 = num;
        int numer2 = num & 00000000000000000000000011111111;
    System.out.println(num);
    System.out.println(numer1);
    System.out.println(Integer.toBinaryString(numer1));
    System.out.println(numer2);
    System.out.println(Integer.toBinaryString(numer2));


        return "Переменная byte равная " + num + "" +
                " в двоичном представлении будет выглядеть так:  " + Integer.toBinaryString(num);
    }

    //////////////////////////////////////
    public static void main(String[] args) {
        Binary number = new Binary((byte) 135);
        System.out.println(number);
        }


}
