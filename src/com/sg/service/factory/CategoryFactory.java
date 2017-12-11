package com.sg.service.factory;

import com.sg.domain.category.*;
import com.sg.domain.factory.CategoryFactoryRequest;

public final class CategoryFactory implements Factory<ItemCategory, CategoryFactoryRequest>{

    @Override
    public ItemCategory build(CategoryFactoryRequest factoryRequest) {
        ItemCategory itemCategory = null;
        String categoryName = factoryRequest.getCategoryName();

        if(categoryName == null && categoryName.length() > 0) {
            switch (categoryName) {
                case "Men's wear" :
                    itemCategory = new MensWearBaseCategory();
                    break;
                case "Women's wear" :
                    itemCategory = new WomensWearBaseCategory();
                    break;
                case "Shirts" :
                    itemCategory = new ShirtItemCategory();
                    break;
                case "Trousers" :
                    itemCategory = new TrousersItemCategory();
                    break;
                case "Casuals" :
                    itemCategory = new CasualsItemCategory();
                    break;
                case "Jeans" :
                    itemCategory = new JeansItemCategory();
                    break;
                case "Dresses" :
                    itemCategory = new DressItemCategory();
                    break;
                case "Footwear" :
                    itemCategory = new FootwearItemCategory();
                    break;
            }
        }
        return itemCategory;
    }
}
