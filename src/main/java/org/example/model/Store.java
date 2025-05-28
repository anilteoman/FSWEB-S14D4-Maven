package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Coke("zero",15,"coladesc",false);
        products[1] = new Bread("tambugday",10,"tambugday ekmek");
        products[2] = new Chocolate("bitter",12,"bitter çiko");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            if(product != null){
                product.showDetails();
            }
        }

    }
}