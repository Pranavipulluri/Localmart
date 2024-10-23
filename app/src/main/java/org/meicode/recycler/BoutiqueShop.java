package org.meicode.recycler;

import java.util.List;

public class BoutiqueShop {
    private String shopName;
    private String phoneNumber;
    private List<Product> products;

    public BoutiqueShop(String shopName, String phoneNumber, List<Product> products) {
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.products = products;
    }

    // Getters and Setters
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
