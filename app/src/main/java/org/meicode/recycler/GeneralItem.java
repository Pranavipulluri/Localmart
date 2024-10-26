package org.meicode.recycler;

public class GeneralItem {
    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private String itemImage;
    private String storeName;
    private String storeAddress;

    public GeneralItem(String itemName, String itemDescription, double itemPrice, String itemImage, String storeName, String storeAddress) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
    }

    // Getters and setters (if needed)
}
