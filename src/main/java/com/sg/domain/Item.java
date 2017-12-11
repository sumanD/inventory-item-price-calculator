package main.java.com.sg.domain;

import main.java.com.sg.domain.brand.Brand;
import main.java.com.sg.domain.category.ItemCategory;

public class Item {
    private int itemId;
    private int itemPrice;
    private Brand brand;
    private ItemCategory itemCategory;

    public Item(int itemId, int itemPrice, Brand brand, ItemCategory itemCategory) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.brand = brand;
        this.itemCategory = itemCategory;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", brand=" + brand +
                ", itemCategory=" + itemCategory +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
