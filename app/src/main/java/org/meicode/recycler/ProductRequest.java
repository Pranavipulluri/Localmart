package org.meicode.recycler;

public class ProductRequest {
    private String description;
    private String userDetails;
    private int imageResourceId; // Declare the imageResourceId field

    public ProductRequest(String description, String userDetails, int imageResourceId) {
        this.description = description;
        this.userDetails = userDetails;
        this.imageResourceId = imageResourceId; // Initialize the resource ID
    }

    public String getDescription() {
        return description;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public int getImageResourceId() {
        return imageResourceId; // Return the drawable resource ID
    }
}
