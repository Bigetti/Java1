package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class Eratosthenes {

    private boolean[] sieve;


    ////////////////////////////////////////////////////////////////
    public static void main(String[] args){

        int N = 7;
        Eratosthenes er = new Eratosthenes(N);
        System.out.println(er);

    }

    ///////////////////////////////////////////////////////////////


    public Eratosthenes(int n){
        sieve = new boolean[n+1];
        sift();

    }

    @Override
    public String toString() {
        return "Eratosthenes{" +
               "sieve=" + Arrays.toString(sieve) +
                '}';


    }

    private void sift(){
        Arrays.fill(sieve, true);
        int p = 0;
        sieve[0] = false;
        sieve[1] = false;
        int len = sieve.length;
        for (int i = 2; i < len; i++) {
            System.out.println();
            if (sieve[i]) {
                p = i;
                System.out.println("p = " + p);
                for (int j = 2; j <= (len - 1) / p; j++) {
                    sieve[j*p] = false;
                    System.out.println(j*p);
                }
            }

        }


    }

    public boolean isSimple(int n){
        return sieve[n];

    }



}
