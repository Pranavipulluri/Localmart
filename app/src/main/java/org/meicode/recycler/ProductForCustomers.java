package org.meicode.recycler;

import java.util.Objects;

/**
 * Represents a product intended for customers.
 */
public class ProductForCustomers {
    private String productName;
    private String description;
    private double price;
    private String imageUrl;
    private String address;

    /**
     * Constructs a new ProductForCustomers instance.
     *
     * @param productName the name of the product
     * @param description a brief description of the product
     * @param price       the price of the product
     * @param imageUrl    the URL of the product image
     * @param address     the address associated with the product
     */
    public ProductForCustomers(String productName, String description, double price, String imageUrl, String address) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (imageUrl == null || imageUrl.isEmpty()) {
            throw new IllegalArgumentException("Image URL cannot be null or empty");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }

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

    @Override
    public String toString() {
        return "ProductForCustomers{" +
                "productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductForCustomers)) return false;
        ProductForCustomers that = (ProductForCustomers) o;
        return Double.compare(that.price, price) == 0 &&
                productName.equals(that.productName) &&
                description.equals(that.description) &&
                imageUrl.equals(that.imageUrl) &&
                address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, description, price, imageUrl, address);
    }
}
