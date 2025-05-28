package org.example.model;

public class Bread extends ProductForSale{

    private String flourType;

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flourType='" + flourType + '\'' +
                '}';
    }
}
