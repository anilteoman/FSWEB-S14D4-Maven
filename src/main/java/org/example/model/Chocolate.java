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

    @Override
    public void showDetails() {
        System.out.println(chocType);
    }
}
