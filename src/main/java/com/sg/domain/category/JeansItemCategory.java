package com.sg.domain.category;

public class JeansItemCategory extends ItemCategory {

    @Override
    void construct() {
        super.name = ItemCategoryEnum.JEANS.getCategoryName();
        super.discount = ItemCategoryEnum.JEANS.getDiscount();
        super.parentCategory = ItemCategoryEnum.JEANS.getParentItemCategory();
    }
}
