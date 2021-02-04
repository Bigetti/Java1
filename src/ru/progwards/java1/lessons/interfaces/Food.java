package ru.progwards.java1.lessons.interfaces;

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

        Animal prm = (Animal) smthHasWeigt;

        if (getWeight() < prm.getWeight())

            return CompareResult.LESS;

        if (getWeight() > prm.getWeight())

            return CompareResult.GREATER;

        else

            return CompareResult.EQUAL;

        //return null;
    }

public static void main(String[] args){

    Food first = new Food(75);
    Food second = new Food(99);
    System.out.println(first.weight);
    System.out.println(second.weight);
    System.out.println(first.compareWeight(second));
    System.out.println(first.getWeight());

    //System.out.println(first.compareWeight());

}


}
