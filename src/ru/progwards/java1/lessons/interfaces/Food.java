package ru.progwards.java1.lessons.interfaces;

//import java.util.Objects;

public class Food implements CompareWeight{

    private int weight;


    public Food(int weight) {
        this.weight = weight;
    }

    public int getWeight()
    {
        return weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt)
    {

        Food prm = (Food) smthHasWeigt;

        if (getWeight() < prm.getWeight())

            return CompareResult.LESS;

        if (getWeight() > prm.getWeight())

            return CompareResult.GREATER;

        else

            return CompareResult.EQUAL;

        //return null;
    }

    @Override
    public String toString() {
        return "Food{" +
                "weight=" + weight +
                '}';
    }

    public static void main(String[] args){

    Food first = new Food(75);
    Food second = new Food(99);
    System.out.println(first.getWeight());
    System.out.println(second.getWeight());
    System.out.println(first.compareWeight(second));




}


}
