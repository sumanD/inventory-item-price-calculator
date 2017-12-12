package com.sg.domain.client.query;

import com.sg.domain.Item;

import java.util.Map;

public class InventoryDataFromRequest {
    private int numberOfItems;
    private Map<Integer,Item> itemMap;

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Map<Integer, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<Integer, Item> itemMap) {
        this.itemMap = itemMap;
    }

    @Override
    public String toString() {
        return "InventoryDataFromRequest{" +
                "numberOfItems=" + numberOfItems +
                ", itemMap=" + itemMap +
                '}';
    }
}
