package org.meicode.recycler;

/**
 * Represents a product for sellers in the application.
 */
public class ProductForSellers {
    private String name;
    private String description;
    private double price;
    private int imageResourceId; // Drawable resource ID

    /**
     * Constructs a new ProductForSellers instance.
     *
     * @param name        the name of the product
     * @param description a brief description of the product
     * @param price       the price of the product
     * @param imageResourceId the drawable resource ID for the product image
     */
    public ProductForSellers(String name, String description, double price, int imageResourceId) {
        // Validate parameters
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

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

    @Override
    public String toString() {
        return "ProductForSellers{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageResourceId=" + imageResourceId +
                '}';
    }

    // Optionally, you could override equals() and hashCode() here
}
