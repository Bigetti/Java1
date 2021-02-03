package ru.progwards.java1.lessons.classes;

public interface CompareWeight {

    public enum CompareResult {
        LESS, EQUAL, GREATER
    }

    public CompareResult compareWeight(CompareWeight smthHasWeigt);

}