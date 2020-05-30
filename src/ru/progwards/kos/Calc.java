package ru.progwards.kos;

public class Calc {
    private static int result;


    public static void main(String[] args) {
        Calc calc1 = new Calc();
        Calc.add(1);
        System.out.println(result);
        Calc.sub(5);
        System.out.println(result);
    }

    public Calc(){
        result = 0;
        }

    public void set(int num){
        result = num;
        }

    public static void  add(int num){
        result += num;
        }

    public static void sub(int num){
        result = result - num;
        }

    public int getResult()
        {
            return result;
        }

    }



