package org.meicode.recycler;


import java.util.List;

public class FoodProduct {
    private String name;           // For the food product name (like "Mango Pickle")
    private String description;    // For the food product description
    private double price;          // For the food product price
    private String category;       // For the category (e.g., "Homemade")
    private String imageUrl;       // For the image URL
    private String artisanName;    // For the artisan/store name
    private List<FoodProduct> productsList;
    // Constructor
    public FoodProduct(String name, String description, double price, String category, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public FoodProduct(String artisanName, String description, List<FoodProduct> productsList) {
        this.artisanName = artisanName;    // Initialize artisanName
        this.description = description;     // Initialize description
        this.productsList = productsList;   // Initialize products list
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public String getImageUrl() { return imageUrl; }
    public String getArtisanName() { return artisanName; }
    public String getProductsList() { return productsList.toString(); }
}
