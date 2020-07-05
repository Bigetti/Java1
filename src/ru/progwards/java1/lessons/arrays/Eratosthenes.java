package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class Eratosthenes {

    private boolean[] sieve;


    ////////////////////////////////////////////////////////////////
    public static void main(String[] args){

        int N = 33;
        Eratosthenes er = new Eratosthenes(N);
        System.out.println(er.isSimple(3));
        System.out.println(er.toString());

    }

    ///////////////////////////////////////////////////////////////


    public Eratosthenes(int n){
        sieve = new boolean[n+1];
        sift();
        isSimple(2);

    }

    @Override
    public String toString() {
        return "Eratosthenes{" +
               "sieve=" + Arrays.toString(sieve) +'}';
        }



    private void sift(){
        Arrays.fill(sieve, true);
        //sieve[0] = true;
        //sieve[1] = true;
        int p = 2;
        for (int i = 2; i * p < sieve.length; i++){
            if (sieve[i]){
                for (p = i * i; p < sieve.length; p+=i) {
                    sieve[p] = false;
                }
            }
        }

    }

    public boolean isSimple(int n){
        return sieve[n];

    }



}
