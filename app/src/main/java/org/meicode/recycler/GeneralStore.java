package org.meicode.recycler;

import java.util.List;

public class GeneralStore {
    private String storeName;
    private String storeAddress;
    private List<GeneralItem> items;

    public GeneralStore(String storeName, String storeAddress, List<GeneralItem> items) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.items = items;
    }

    // Getters and setters (if needed)
}
