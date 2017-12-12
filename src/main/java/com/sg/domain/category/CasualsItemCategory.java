package com.sg.domain.category;

public class CasualsItemCategory extends ItemCategory {

    @Override
    void construct() {
        super.name = ItemCategoryEnum.CASUALS.getCategoryName();
        super.discount = ItemCategoryEnum.CASUALS.getDiscount();
        super.parentCategory = ItemCategoryEnum.CASUALS.getParentItemCategory();
    }
}
