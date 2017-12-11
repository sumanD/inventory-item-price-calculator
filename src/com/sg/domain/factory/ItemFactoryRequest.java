package com.sg.domain.factory;

public class ItemFactoryRequest {
    private int itemId;
    private String brandName;
    private String categoryName;
    private int price;

    public ItemFactoryRequest(int itemId, String brandName, String categoryName, int price) {
        this.itemId = itemId;
        this.brandName = brandName;
        this.categoryName = categoryName;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getPrice() {
        return price;
    }
}
