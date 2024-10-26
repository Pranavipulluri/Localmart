package org.meicode.recycler;

import java.util.List;

public class BoutiqueShop {
    private String shopName;
    private String phoneNumber;
    private List<ProductForCustomers> products;

    public BoutiqueShop(String shopName, String phoneNumber, List<ProductForCustomers> products) {
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

    public List<ProductForCustomers> getProducts() {
        return products;
    }

    public void setProducts(List<ProductForCustomers> products) {
        this.products = products;
    }
}
