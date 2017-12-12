package com.sg.domain.category;

public class WomensWearBaseCategory extends ItemCategory {

    @Override
    void construct() {
        super.name = ItemCategoryEnum.WOMENS_WEAR.getCategoryName();
        super.discount = ItemCategoryEnum.WOMENS_WEAR.getDiscount();
        super.parentCategory = ItemCategoryEnum.WOMENS_WEAR.getParentItemCategory();
    }
}
