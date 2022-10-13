package ro.myClass.models;

public class Decaf extends Beverage{
    private String description;
    public Decaf(){
        description = "Decaf Cofee";
    }
    @Override
    public double cost() {
        return 1.05;
    }

}
