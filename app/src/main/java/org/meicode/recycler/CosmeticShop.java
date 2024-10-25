package org.meicode.recycler;

import java.util.List;

public class CosmeticShop {
    private String storeName;
    private String storeAddress;
    private List<CosmeticItem> items;

    public CosmeticShop(String storeName, String storeAddress, List<CosmeticItem> items) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.items = items;
    }

    // Getters
    public String getStoreName() {
        return storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public List<CosmeticItem> getItems() {
        return items;
    }
}
