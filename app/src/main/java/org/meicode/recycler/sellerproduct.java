package org.meicode.recycler;

public class sellerproduct {
    private String name;
    private String description;
    private String imageUrl;
    private String price; // Assuming price is a String; you can change it to a double if preferred

    public sellerproduct(String name, String description, String imageUrl, String price) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
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

    public String getPrice() {
        return price;
    }
}
