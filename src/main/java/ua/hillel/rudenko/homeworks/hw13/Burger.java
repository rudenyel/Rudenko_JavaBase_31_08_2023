package ua.hillel.rudenko.homeworks.hw13;

public class Burger {
    private String name;
    private int bun;
    private int meat;
    private int sauce;
    private int salad;

    protected Burger(String name, int bun, int meat, int sauce, int salad) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.sauce = sauce;
        this.salad = salad;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + " ingredients: " + bun + " bun, " + meat + " meat, " + sauce + " sauce, "  + salad + " salad";
    }
}