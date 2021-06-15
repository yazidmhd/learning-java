package com.learning;

import java.util.ArrayList;

public class Caveman {
    // private - cannot be referenced from outside of the code in this page
    // in order to get the variables with private class - need Getters and Setters
    private String name;
    private int age;
    private float weight;

    // use Rock class in Caveman class
    // give Caveman, a rock collection
    private ArrayList<Rock> rockCollection;

    // parameterized constructor
    public Caveman(String name, int age, float weight, ArrayList<Rock> r) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.rockCollection = r;
    }

    // default constructor
    public Caveman() {
        this.name = "They haven't given me a name yet";
        this.age = 0;
        this.weight = 100f;
        this.rockCollection = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Caveman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", rockCollection=" + rockCollection +
                '}';
    }

    // return type void - no data is returned from this method
    public void sayHi() {
        System.out.println("Hi my name is " + this.name);
    }

    // Getters and Setters
    public ArrayList<Rock> getRockCollection() {
        return rockCollection;
    }

    public void setRockCollection(ArrayList<Rock> rockCollection) {
        this.rockCollection = rockCollection;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
