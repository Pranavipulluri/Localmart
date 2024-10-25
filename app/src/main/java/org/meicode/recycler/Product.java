package org.meicode.recycler;

public class Product {
    private String name;
    private String description;
    private double price;
    private int imageResourceId; // Drawable resource ID

    public Product(String name, String description, double price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId; // Initialize the resource ID
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId; // Return the drawable resource ID
    }
}
