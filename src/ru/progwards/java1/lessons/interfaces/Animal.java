/*
Задача 3. Сортировка интерфейса на основе ArraySort

        3.1 Создать интерфейс CompareWeight
        3.2 В нем создать public enum CompareResult, со значениями LESS, EQUAL, GREATER
3.3 Интерфейс должен содержать метод public CompareResult compareWeight(CompareWeight smthHasWeigt)

        3.4 Для класса Animal реализовать интерфейс CompareWeight..Сравнение сделать на основе веса животного.
        Метод CompareResult compareWeight должен возвращать
        LESS если свой вес < веса параметра метода
        EQUAL если свой вес = веса параметра метода
        GREATER если свой вес > веса параметра метода

        3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
        3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах, реализовать
        в классе конструктор, принимающий и устанавливающий значение веса.
        3.7 Реализовать метод public int getWeight(), возвращающий сохраненное значение веса.
        3.7 Для класса Food реализовать интерфейс CompareWeight..Сравнение сделать на основе веса еды.
        Метод CompareResult compareWeight должен возвращать
        Метод CompareResult compareWeight должен возвращать
        LESS если свой вес < веса параметра метода
        EQUAL если свой вес = веса параметра метода
        GREATER если свой вес > веса параметра метода

        3.8 Скопировать реализацию сортировки из класса ArraySort из задачи 2 урока 6 и
        переделать сортировку массива
        целых чисел на сортировку через интерфейс
         CompareWeight public static void sort(CompareWeight[] a)
*/


package ru.progwards.java1.lessons.interfaces;

public class Animal implements CompareWeight{

    private double weight;

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt)



    {
        //return null;
        Animal prm = (Animal) smthHasWeigt;
    if (getWeight() < prm.getWeight())

        return CompareResult.LESS;

    if (getWeight() >prm.getWeight())

        return CompareResult.GREATER;

    else

        return CompareResult.EQUAL;
    }



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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return Double.compare(animal.calculateFoodWeight(), calculateFoodWeight()) == 0;
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
        System.out.println(cow.getWeight());
        System.out.println(duck.getKind());
        System.out.println(duck.getFoodCoeff());
        System.out.println(duck.getWeight());
        System.out.println(duck.calculateFoodWeight());
        System.out.println(duck.compareWeight(cow));
    }

}

class Cow extends Animal {


    public Cow(double weight) {
        super(weight);
    }

    @Override
    public Animal.AnimalKind getKind() {
        return Animal.AnimalKind.COW;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return Animal.FoodKind.HAY;
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
    public Animal.AnimalKind getKind() {
        return Animal.AnimalKind.HAMSTER;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return Animal.FoodKind.CORN;
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
    public Animal.AnimalKind getKind() {
        return Animal.AnimalKind.DUCK;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return Animal.FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }
}








    /////////////////////////////////////////////////////


//////////////////////////////////////////////////////////


