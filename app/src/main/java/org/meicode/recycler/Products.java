package org.meicode.recycler;

public class Products {
    private String productName;
    private String description;
    private double price;
    private String imageUrl;
    private String address;

    public Products(String productName, String description, double price, String imageUrl, String address) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.address = address;
    }

    // Getters for the fields
    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAddress() {
        return address;
    }
}
