package com.sg.service.factory;


import com.sg.domain.category.*;
import com.sg.domain.factory.CategoryFactoryRequest;

/**
 * Factory class for creating Item Category
 */
public final class CategoryFactory implements Factory<ItemCategory, CategoryFactoryRequest>{

    @Override
    public ItemCategory build(CategoryFactoryRequest factoryRequest) {
        ItemCategory itemCategory = null;
        String categoryName = factoryRequest.getCategoryName();

        if(categoryName != null && categoryName.length() > 0) {
            categoryName = categoryName.trim();

            if(categoryName.equals("Men's wear")) {
                itemCategory = new MensWearBaseCategory();
            }
            else if(categoryName.equals("Women's wear")) {
                itemCategory = new WomensWearBaseCategory();
            }
            else if(categoryName.equals("Shirts")) {
                itemCategory = new ShirtItemCategory();
            }
            else if(categoryName.equals("Trousers")) {
                itemCategory = new TrousersItemCategory();
            }
            else if(categoryName.equals("Casuals")) {
                itemCategory = new CasualsItemCategory();
            }
            else if(categoryName.equals("Jeans")) {
                itemCategory = new JeansItemCategory();
            }
            else if(categoryName.equals("Dresses")) {
                itemCategory = new DressItemCategory();
            }
            else if(categoryName.equals("Footwear")) {
                itemCategory = new FootwearItemCategory();
            }
        }
        return itemCategory;
    }
}
