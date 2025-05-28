package org.example.model;

public class Coke extends ProductForSale{

    private boolean hasSugar;

    public boolean isHasSugar() {
        return hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    public Coke(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                '}';
    }
}
