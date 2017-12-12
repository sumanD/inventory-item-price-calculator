package com.sg.domain.category;

public class ShirtItemCategory extends ItemCategory{
    @Override
    void construct() {
        super.name = ItemCategoryEnum.SHIRT.getCategoryName();
        super.discount = ItemCategoryEnum.SHIRT.getDiscount();
        super.parentCategory = ItemCategoryEnum.SHIRT.getParentItemCategory();
    }
}
