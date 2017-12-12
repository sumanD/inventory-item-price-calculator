package com.sg.domain.category;

import com.sg.domain.Discount;

/**
 * Abstract class to represent a Category
 * Specific Category are implemented in respective class
 */
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
