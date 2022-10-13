package ro.myClass.models;

public class DarkRoast extends Beverage {

    private String description;
    public DarkRoast(){
        description="Most Excellent Dark Roast";

    }
    @Override
    public double cost() {
        return .99;

    }
}
