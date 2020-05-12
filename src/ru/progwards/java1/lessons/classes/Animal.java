package ru.progwards.java1.lessons.classes;

public class Animal {

    double foodCoeff = 0.02d;
    private double weight = 1d;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    enum FoodKind {UNKNOWN, HAY, CORN};

    AnimalKind animalKind = AnimalKind.ANIMAL;
    FoodKind foodKind = FoodKind.UNKNOWN;

    public static void main(String[] args) {

        Animal animal = new Animal(AnimalKind.DUCK, FoodKind.CORN, 3, 0.04);
        System.out.println(animal);
    }

    public Animal(double weight) {
        this.weight = weight;

    }

    public Animal(AnimalKind animalKind, FoodKind food, double weight, double foodCoeff) {
        this.animalKind = animalKind;
        this.foodKind = food;
        this.weight = weight;
        this.foodCoeff = foodCoeff;
    }

    public AnimalKind getKind() {
        return animalKind = AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return foodKind = FoodKind.UNKNOWN;
    }

    public double getWeight(){
        return weight;
    }

    public double getFoodCoeff(){
        return foodCoeff;
    }

    public double calculateFoodWeight(){
        return getWeight() * getFoodCoeff();
    }


    @Override
    public String toString() {
        return "I am " + animalKind + " eat " + foodKind  + " " + calculateFoodWeight();
    }
    //@Override
    //public String toStringFull(){
    //    return  "I am " + animalKind +  " eat" + foodKind + " " + calculateFoodWeight();
    //}


}

class Cow extends Animal{


    public Cow(double weight) {
        super(weight);
    }

    public AnimalKind getKind(){
        return animalKind = AnimalKind.COW;
    }

    public FoodKind getFoodKind(){
        return foodKind = FoodKind.HAY;
    }

    public double getFoodCoeff(){
        return foodCoeff = 0.05;
    }
}

class Hamster extends Animal{

    public Hamster(double weight) {
        super(weight);
    }

    public AnimalKind getKind(){
        return animalKind = AnimalKind.HAMSTER;
    }

    public FoodKind getFoodKind(){
        return foodKind = FoodKind.CORN;
    }

    public double getFoodCoeff(){
        return foodCoeff = 0.03;
    }
}

class Duck extends Animal{


    public Duck(double weight) {
        super(weight);
    }
    public AnimalKind getKind(){
        return animalKind = AnimalKind.DUCK;
    }

    public FoodKind getFoodKind(){
        return foodKind = FoodKind.CORN;
    }

    public double getFoodCoeff(){
        return foodCoeff = 0.04;
    }

}
