package org.meicode.recycler;


class SkincareProduct {
    private String productName;
    private String productDescription;
    private double price;
    private String imageUrl;

    // Constructor
    public SkincareProduct(String productName, String productDescription, double price, String imageUrl) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
