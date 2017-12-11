package main.java.com.sg.domain.category;

public class FootwearItemCategory extends ItemCategory{

    @Override
    void construct() {
        super.name = ItemCategoryEnum.FOOTWEAR.getCategoryName();
        super.discount = ItemCategoryEnum.FOOTWEAR.getDiscount();
        super.parentCategory = ItemCategoryEnum.FOOTWEAR.getParentItemCategory();
    }
}
