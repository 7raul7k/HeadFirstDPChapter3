package ro.myClass.models;

public class Espresso extends Beverage{
    private String description;
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
