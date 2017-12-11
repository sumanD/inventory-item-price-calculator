package main.java.com.sg.domain.category;

public class TrousersItemCategory extends ItemCategory{

    @Override
    void construct() {
        super.name = ItemCategoryEnum.TROUSERS.getCategoryName();
        super.discount = ItemCategoryEnum.TROUSERS.getDiscount();
        super.parentCategory = ItemCategoryEnum.TROUSERS.getParentItemCategory();
    }
}
