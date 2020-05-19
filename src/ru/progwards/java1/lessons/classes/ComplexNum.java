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
        System.out.println(num1.add(num2));
        System.out.println(num1.sub(num2));
        System.out.println(num1.mul(num2));
        System.out.println(num1.div(num2));
        System.out.println("Ненавижу синусы косинусы тангенсы катангенсы факториалы модули комплексные числа корни \n" +
                " и всю остальную высшую математику.");

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

  //  public static ComplexNum newComplexNum(int a, int b) {
    //     return new ComplexNum(a, b);
  //  }

    // с
    // ложение комплексных чисел по формуле: (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(this.a + num.a, this.b + num.b);
    }

    // вычитание комплексных чисел по формуле: (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(this.a - num.a, this.b - num.b);
    }

    // умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum(this.a * num.a - this.b * num.b, this.b * num.a + this.a * num.b);
    }

    // деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((c*b - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num) {
        int a = this.a, b = this.b, c = num.a, d = num.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d),
                (b * c - a * d) / (c * c + d * d));
    }

}











