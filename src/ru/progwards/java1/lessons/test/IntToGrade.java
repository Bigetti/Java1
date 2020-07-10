package ru.progwards.java1.lessons.test;

import org.w3c.dom.ls.LSOutput;

public class IntToGrade {

    enum Grade {VERYBAD, BAD, SATISFACTORILY, GOOD, EXCELLENT, NOTDEFINED};


    /////////////////////////////////////////////////////////
    public static void main(String[] args) {

        intToGrade(3);
    }
     /////////////////////////////////////////////////////////


    static Grade intToGrade(int grade){

        switch (grade){
            case 1:
                System.out.println("VERYBAD");
                return Grade.VERYBAD;
            case 2:
                System.out.println("BAD");
                return  Grade.BAD;
            case 3:
                System.out.println("SATISFACTORILY");
                return  Grade.SATISFACTORILY;
            case 4:
                System.out.println("GOOD");
                return  Grade.GOOD;
            case 5:
                System.out.println("EXCELLENT");
                return  Grade.EXCELLENT;
            default:
                System.out.println("NOTDEFINED");
                return Grade.NOTDEFINED;
        }


    }

}
