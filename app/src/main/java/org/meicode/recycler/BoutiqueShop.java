package org.meicode.recycler;

import java.util.List;

public class BoutiqueShop {
    private String shopName;
    private String phoneNumber;
    private List<Products> products;

    public BoutiqueShop(String shopName, String phoneNumber, List<Products> products) {
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

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
