package com.company;
public class Vegetables {
    public String name;
    public int years,weight;

    public Vegetables(String name, int years, int weight) {
        this.name = name;
        this.years = years;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", weight=" + weight +
                '}';
    }
}
