package org.meicode.recycler;

public class SellerProduct {
    private String name;
    private String description;
    private String imageUrl;
    private double price; // Changed to double for better handling of numerical values

    public SellerProduct(String name, String description, String imageUrl, double price) {
        // Validate parameters
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (imageUrl == null || imageUrl.isEmpty()) {
            throw new IllegalArgumentException("Image URL cannot be null or empty");
        }

        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price; // Initialize price as a double
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price; // Return price as a double
    }

    @Override
    public String toString() {
        return "SellerProduct{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                '}';
    }
}
