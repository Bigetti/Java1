package ru.progwards.kos;

public class Person{
    private String name;
    private int age;
    private String country = "RU";


    public Person(String name_a, int age_a){
        name = name_a;
        age = age_a;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    String getCountry(){
        return country;
    }


}

