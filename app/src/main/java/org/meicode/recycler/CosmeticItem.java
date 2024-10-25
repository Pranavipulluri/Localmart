package org.meicode.recycler;

public class CosmeticItem {
    private String productName;
    private String productDescription;
    private double productPrice;
    private String productImage;
    private String shopName;
    private String shopAddress;

    public CosmeticItem(String productName, String productDescription, double productPrice, String productImage, String shopName, String shopAddress) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

}
