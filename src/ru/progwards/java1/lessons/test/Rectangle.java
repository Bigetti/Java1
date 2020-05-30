package ru.progwards.java1.lessons.test;

import java.awt.*;

public class Rectangle {

        private double a;
        private double b;
        double area;
        int compare;

    ///////////////////////////////////////////////////////////////
     public static void main(String[] args) {

         Rectangle res1 = new Rectangle(3,6);
         System.out.println(res1);
         Rectangle res2 = new Rectangle(6,4);
         System.out.println(res2);
         //System.out.println(Double.compare(res1.area(),res2.area()));
         System.out.println(res1.compareTo(res2));

     }

    /////////////////////////////////////////////////////////////////

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double area() {

            return area = a*b;
        }

    @Override
    public String toString() {
        return "прямоугольник " + a + "x" + b;

    }


    public int compareTo(Rectangle anRectangle){

        int compare = Double.compare(this.area(), anRectangle.area());
        //int compare = Double.valueOf(this.area()).compareTo(anRectangle.area());
        return compare;
     }
}

