package com.sg.domain.category;

public class DressItemCategory extends ItemCategory {

    @Override
    void construct() {
        super.name = ItemCategoryEnum.DRESSES.getCategoryName();
        super.discount = ItemCategoryEnum.DRESSES.getDiscount();
        super.parentCategory = ItemCategoryEnum.DRESSES.getParentItemCategory();
    }
}
