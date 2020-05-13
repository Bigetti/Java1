package ru.progwards.java1.lessons.classes;

public class Animal {

    //double foodCoeff = 0.02d;
    private double weight;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}

    ;

    enum FoodKind {UNKNOWN, HAY, CORN}

    ;

    //AnimalKind animalKind = AnimalKind.ANIMAL;
    //FoodKind foodKind = FoodKind.UNKNOWN;

    public static void main(String[] args) {

        Animal animal = new Animal(1);
        System.out.println(animal);
        Hamster hamster = new Hamster(4);
        System.out.println(hamster);


    }

    public Animal(double weight) {
        this.weight = weight;

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


    @Override
    public String toString() {
        return "I am " + getKind() + " eat " + getFoodKind() + " " + calculateFoodWeight();
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
