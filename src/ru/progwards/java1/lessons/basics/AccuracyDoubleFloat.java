package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static void main(String[] args){

        volumeBallDouble(6371.2d);
        volumeBallFloat((float) 6371.2f);
        calculateAccuracy(6371.2);
    }

    public static double volumeBallDouble(double radius){
        double p =3.14;
        double Vd = 4d/3d*p*radius*radius*radius;
        //System.out.println(Vd);
        return Vd;
    }

    public static float volumeBallFloat(float radius){
        float p = 3.14f;
        float Vf = 4f/3f*p*radius*radius*radius;
        //System.out.println(Vf);
        return Vf;

    }

    public static double calculateAccuracy(double radius)
    {
        double Vd =  volumeBallDouble(radius);
        float Vf = volumeBallFloat((float) radius);
        double diff = volumeBallDouble(radius) - volumeBallFloat((float) radius);
        System.out.println(Vd + " Обьем земли в типе дабл");
        System.out.println(Vf + " Обьем земли в типе флоат");
        System.out.println(diff + " Разница между значениями дабл и флоат");
        return diff;

    }
}
