package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class Eratosthenes {

    private boolean[] sieve;


    ////////////////////////////////////////////////////////////////
    public static void main(String[] args){

        int N = 100;
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
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i * i < sieve.length; i++){
            if (sieve[i]){
                for (int j = i * i; j < sieve.length; j+=i) {
                    sieve[j] = false;
                }
            }
        }

    }

    public boolean isSimple(int n){
        return sieve[n];

    }



}
