package org.meicode.recycler;

public class Product {
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String shopLocation; // New field for shop location

    public Product(String name, String description, double price, String imageUrl, String shopLocation) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.shopLocation = shopLocation; // Initialize the new field
    }

    public Product(String name, String description, String s, String imageUrl) {
    }

    // Getters for all fields, including the new shopLocation
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getImageUrl() { return imageUrl; }
    public String getShopLocation() { return shopLocation; } // Getter for shop location
}
