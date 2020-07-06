package ru.progwards.java1.lessons.test;

import org.w3c.dom.ls.LSOutput;

public class IntToGrade {

    enum Grade {VERYBAD, BAD, SATISFACTORILY, GOOD, EXCELLENT, NOTDEFINED};
    //int grade = 3;

    /////////////////////////////////////////////////////////
    public static void main(String[] args) {

        intToGrade(4);

    }




    /////////////////////////////////////////////////////////


    static Grade intToGrade(int grade){

        switch (grade){
            case 1: return  System.out.println("VERYBAD");
            case 2: return  System.out.println("BAD");
            case 3: return  System.out.println("SATISFACTORILY");
            case 4: return  System.out.println("GOOD");
            case 5: return  System.out.println("EXCELLENT");
            default: return System.out.println("NOTDEFINED");
        }


    }

}
