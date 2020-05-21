package ru.progwards.java1.lessons.test;

import java.awt.*;

public class Restangle {

        private double a;
        private double b;
        double area;

     ///////////////////////////////////////////////////////////////
     public static void main(String[] args) {

         Restangle res1 = new Restangle(3,6);
         System.out.println(res1);
         Restangle res2 = new Restangle(6,4);
         System.out.println(res2);
         System.out.println(compareTo(res1, res2));
         


     }

    /////////////////////////////////////////////////////////////////

        public Restangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double area() {

            return area = a*b;
        }


    public int compareTo(Rectangle anRectangle){
        return this.area.compareTo(anRectangle.area);
     }
}

