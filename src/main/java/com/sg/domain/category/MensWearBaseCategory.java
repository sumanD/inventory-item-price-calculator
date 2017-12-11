package main.java.com.sg.domain.category;

public class MensWearBaseCategory extends ItemCategory{

    @Override
    void construct() {
        super.name = ItemCategoryEnum.MENS_WAEAR.getCategoryName();
        super.discount = ItemCategoryEnum.MENS_WAEAR.getDiscount();
        super.parentCategory = ItemCategoryEnum.MENS_WAEAR.getParentItemCategory();
    }
}
