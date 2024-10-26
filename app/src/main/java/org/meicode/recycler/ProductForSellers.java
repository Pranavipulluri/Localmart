package org.meicode.recycler;

import android.net.Uri;

public class ProductForSellers {
    private String name;
    private String description;
    private double price;
    private Uri imageUri; // Change from int to Uri

    public ProductForSellers(String name, String description, double price, Uri imageUri) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUri = imageUri;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Uri getImageUri() {
        return imageUri;
    }
}
