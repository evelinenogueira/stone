package com.company;

public class Item {

    private String product;
    private Integer quantity;
    private Integer pricePerUnity;
    private static int valorAPagar;


    public Item(String product, int quantity, int pricePerUnity){

        this.product = product;
        this.quantity = quantity;
        this.pricePerUnity= pricePerUnity;
        Item.valorAPagar += quantity * pricePerUnity;

    }


    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPricePerUnity() {
        return pricePerUnity;
    }

    public static int getValorAPagar() {
        return valorAPagar;
    }
}
