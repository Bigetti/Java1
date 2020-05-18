package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    int a;
    int b;
    //ComplexNum num1;
    //ComplexNum num2;


    /////////////////////////////////////////////
    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(3, 4);
        System.out.println(num1);
        ComplexNum num2 = new ComplexNum(2, 2);
        System.out.println(num2);
        System.out.println(add(num1, num2));
        System.out.println(sub(num1, num2));
        System.out.println(mul(num1, num2));
        System.out.println(div(num1, num2));

    }
    /////////////////////////////////////////////


    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }

    public static ComplexNum newComplexNum(int a, int b) {
        return new ComplexNum(a, b);
    }

    // сложение комплексных чисел по формуле: (a + bi) + (c + di) = (a + c) + (b + d)i
    public static ComplexNum add(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a + num2.a, num1.b + num2.b);
    }

    // вычитание комплексных чисел по формуле: (a + bi) - (c + di) = (a - c) + (b - d)i
    public static ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a - num2.a, num1.b - num2.b);
    }

    // умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public static ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.a * num2.a - num1.b * num2.b, num1.b * num2.a + num1.a * num2.b);
    }

    // деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public static ComplexNum div(ComplexNum num1, ComplexNum num2) {
        int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }
}











