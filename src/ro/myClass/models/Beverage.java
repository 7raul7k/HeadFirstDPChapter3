package ro.myClass.models;

public abstract class Beverage {
    public enum Size {TALL,GRANDE,VENTI};
    Size size = Size.TALL;
    private boolean milk,soy,mocha,whip;
    private String description = "Unknown Beverage";

    private double milkCost,soyCost,mochaCost,whipCost;

    public String getDescription() {
        return description;
    }
    public  double cost(){
        double condimentCost = 0.0;
        if(hasMilk()){
            condimentCost += milkCost;
        }
        if(hasSoy()){
            condimentCost += mochaCost;
        }
        if(hasMocha()){
            condimentCost += mochaCost;
        }
        if(hasWhip()){
            condimentCost += whipCost;
        }
        return condimentCost;
    }




    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMilkCost() {
        return milkCost;
    }

    public void setMilkCost(double milkCost) {
        this.milkCost = milkCost;
    }

    public double getSoyCost() {
        return soyCost;
    }

    public void setSoyCost(double soyCost) {
        this.soyCost = soyCost;
    }

    public double getMochaCost() {
        return mochaCost;
    }

    public void setMochaCost(double mochaCost) {
        this.mochaCost = mochaCost;
    }

    public double getWhipCost() {
        return whipCost;
    }

    public void setWhipCost(double whipCost) {
        this.whipCost = whipCost;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
