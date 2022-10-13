package ro.myClass.models;

public class HouseBlend extends Beverage{
    private String description;
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
