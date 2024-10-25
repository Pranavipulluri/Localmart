package org.meicode.recycler;

import java.util.List;

public class SkincareStore {
    private String storeName;
    private String storeLocation;
    private List<SkincareProduct> products;

    // Constructor
    public SkincareStore(String storeName, String storeLocation, List<SkincareProduct> products) {
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.products = products;
    }

    // Getters and Setters
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public List<SkincareProduct> getProducts() {
        return products;
    }

    public void setProducts(List<SkincareProduct> products) {
        this.products = products;
    }
}