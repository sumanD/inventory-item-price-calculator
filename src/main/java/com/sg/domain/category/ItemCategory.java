package main.java.com.sg.domain.category;

import main.java.com.sg.domain.Discount;

public abstract class ItemCategory {
    protected String name;
    protected ItemCategory parentCategory;
    protected Discount discount;

    public ItemCategory() {
        construct();
    }

    abstract void construct();

    public final String getName() {
        return name;
    }
    public final ItemCategory getParentCategory() {
        return parentCategory;
    }
    public final Discount getDiscount() {
        return discount;
    }
}
