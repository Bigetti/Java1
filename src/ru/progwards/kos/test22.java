package ru.progwards.kos;

public class test22
{
    public static void main(String[] args)
    {
        //textGrade(88);
        factorial(3);
    }

static void textGrade(int grade)
{
    if (grade == 0) {
        System.out.println("не оценено");
    } else if (1 <= grade && grade <= 20) {
        System.out.println("очень плохо");
    } else if (20 <= grade && grade <= 40) {
        System.out.println("плохо");
    } else if (40 <= grade && grade <= 60) {
        System.out.println("удовлетворительно");
    } else if (60 <= grade && grade <= 80) {
        System.out.println("хорошо");
    } else if (80 <= grade && grade <= 100) {
        System.out.println("отлично");
    }

}

    static long factorial(long n)
    {
        long res = 1L;
        for(long i = 1; i <= n; i++)
        {
            res = res * i;
        }

        System.out.println(res);
        return res;
    }
}