package io.zipcoder.polymorphism;

public class Penguin extends Pet{

    public Penguin(){
        super("Tux");
    }

    public Penguin(String name){
        super(name);
    }

    public String speak(){
        return "honk";
    }
}
