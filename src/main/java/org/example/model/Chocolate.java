package org.example.model;

public class Chocolate extends ProductForSale{

    private String chocType;

    public String getChocType() {
        return chocType;
    }

    public void setChocType(String chocType) {
        this.chocType = chocType;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String chocType) {
        super(type, price, description);
        this.chocType = chocType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocType='" + chocType + '\'' +
                '}';
    }
}
