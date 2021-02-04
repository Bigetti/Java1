package ru.progwards.java1.lessons.classes;

import java.util.Objects;

public class Animal {

    private double weight;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};

    enum FoodKind {UNKNOWN, HAY, CORN};

    public Animal(double weight) {
        this.weight = weight;

    }

    public interface FoodCompare {
        public int compareFoodPrice();
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return 0.02;
    }

    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    public double getFoodPrice(){
        return calculateFoodWeight() * getFood1kgPrice();
    }


    public double getFood1kgPrice()
    {
        switch (getFoodKind()){
            case HAY:
                return 20;

            case CORN:
                return 50;

            default: return 0;
        }
    }

    public int compareFoodPrice(Animal animal){
        return Double.compare(getFoodPrice(),animal.getFoodPrice());

    }


    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();

    }




    public static void main(String[] args) {

        Animal animal = new Animal(1);
        System.out.println(animal.calculateFoodWeight());
        System.out.println(animal);
        Hamster hamster = new Hamster(4);
        Hamster yellow = new Hamster(11);
        System.out.println(yellow);
        System.out.println(hamster);
        Duck duck = new Duck(7);
        Duck duck1 = new Duck(4);
        Cow cow = new Cow(233);
        Cow Burenka = new Cow(544);
        System.out.println(Burenka);
        System.out.println(cow);
        System.out.println(duck.toString());
        System.out.println(duck.toStringFull());
        System.out.println(duck1.toStringFull());
        System.out.println(yellow.compareFoodPrice(duck));
        System.out.println(duck.compareFoodPrice(cow));
        System.out.println(cow.getFoodKind());
        System.out.println(cow.getFoodCoeff());
        System.out.println(cow.getFood1kgPrice());
        System.out.println(cow.calculateFoodWeight());
        System.out.println(duck.compareFoodPrice(cow));
    }

}

class Cow extends Animal {


    public Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }


    @Override
    public double getFoodCoeff() {
        return 0.05;
    }
}

class Hamster extends Animal {

    public Hamster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.03;
    }
}

class Duck extends Animal {


    public Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }
}








    /////////////////////////////////////////////////////


//////////////////////////////////////////////////////////


