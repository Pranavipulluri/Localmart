package org.meicode.recycler;

public class Item {
    private int imageResId;
    private String name;
    private String description;
    private String shopName;
    private String phoneNumber;
    private String mapUrl;

    public Item(int imageResId, String name, String description, String shopName, String phoneNumber, String mapUrl) {
        this.imageResId = imageResId;
        this.name = name;
        this.description = description;
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.mapUrl = mapUrl;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getShopName() {
        return shopName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMapUrl() {
        return mapUrl;
    }
}
