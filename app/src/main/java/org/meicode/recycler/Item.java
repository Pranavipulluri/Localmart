package org.meicode.recycler;

/**
 * Represents an item with various attributes related to a product or service.
 */
public class Item {
    private int imageResId; // Resource ID for the item image
    private String name; // Name of the item
    private String description; // Description of the item
    private String shopName; // Name of the shop selling the item
    private String phoneNumber; // Contact phone number for the shop
    private String mapUrl; // URL for the shop's location on a map

    /**
     * Constructor to initialize the Item object.
     *
     * @param imageResId Resource ID of the item's image
     * @param name Name of the item
     * @param description Description of the item
     * @param shopName Name of the shop
     * @param phoneNumber Contact number of the shop
     * @param mapUrl URL for the shop's location
     */
    public Item(int imageResId, String name, String description, String shopName, String phoneNumber, String mapUrl) {
        this.imageResId = imageResId;
        this.name = name;
        this.description = description;
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.mapUrl = mapUrl;
    }

    // Getter methods
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
