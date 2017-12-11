package main.java.com.sg.domain.category;

import main.java.com.sg.domain.Discount;
import main.java.com.sg.service.util.BaseItemCategories;

public enum ItemCategoryEnum {

    MENS_WAEAR("Men's wear",new Discount(0),null),
    WOMENS_WEAR("Women's wear",new Discount(50),null),
    SHIRT("Shirt",new Discount(0), BaseItemCategories.getBaseItemCategory("Men's wear")),
    TROUSERS("Trousers",new Discount(0),BaseItemCategories.getBaseItemCategory("Men's wear")),
    CASUALS("Casuals",new Discount(30),BaseItemCategories.getBaseItemCategory("Men's wear")),
    JEANS("Jeans",new Discount(20),BaseItemCategories.getBaseItemCategory("Men's wear")),
    DRESSES("Dresses",new Discount(0),BaseItemCategories.getBaseItemCategory("Women's wear")),
    FOOTWEAR("Footwear",new Discount(0),BaseItemCategories.getBaseItemCategory("Women's wear"));

    private String categoryName;
    private Discount discount;
    private ItemCategory parentItemCategory;

    ItemCategoryEnum(String categoryName, Discount discount, ItemCategory parentItemCategory) {
        this.categoryName = categoryName;
        this.discount = discount;
        this.parentItemCategory = parentItemCategory;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public Discount getDiscount() {
        return this.discount;
    }

    public ItemCategory getParentItemCategory() {
        return this.parentItemCategory;
    }
}
