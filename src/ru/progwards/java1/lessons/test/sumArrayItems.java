package ru.progwards.java1.lessons.test;

public class sumArrayItems {



    public static int[] a = {2,4,6,77,54};
    static int sum = 0;

    public static void main(String[] args) {
        sum = sumArrayItems(a);
        System.out.println(sum);
    }



    public static int sumArrayItems(int[] a){
        int result = 0;
        for (int i = 0; i < a.length; i++){
            result += a[i];
            }

        return result;
    }
}
