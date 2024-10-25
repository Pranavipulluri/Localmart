package org.meicode.recycler;

public class ProductRequest {
    private String description;
    private String userDetails;
    private int imageResourceId;

    // Constructor
    public ProductRequest(String description, String userDetails, int imageResourceId) {
        this.description = description;
        this.userDetails = userDetails;
        this.imageResourceId = imageResourceId;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}

