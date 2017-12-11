package main.java.com.sg.service.util;

import main.java.com.sg.domain.category.ItemCategory;
import main.java.com.sg.domain.category.ItemCategoryEnum;
import main.java.com.sg.domain.factory.CategoryFactoryRequest;
import main.java.com.sg.service.factory.CategoryFactory;

import java.util.HashMap;
import java.util.Map;

public final class BaseItemCategories {
    private static final Map<String,ItemCategory> baseItemCategoryMap = new HashMap<>();

    private static CategoryFactory categoryFactory;

    static {
        categoryFactory = new CategoryFactory();

        CategoryFactoryRequest factoryRequest = new CategoryFactoryRequest(ItemCategoryEnum.MENS_WAEAR.getCategoryName());
        ItemCategory mensWearBaseItemCategory = categoryFactory.build(factoryRequest);
        baseItemCategoryMap.put(mensWearBaseItemCategory.getName(),mensWearBaseItemCategory);

        factoryRequest = new CategoryFactoryRequest(ItemCategoryEnum.WOMENS_WEAR.getCategoryName());
        ItemCategory womensWearBaseItemCategory = categoryFactory.build(factoryRequest);
        baseItemCategoryMap.put(womensWearBaseItemCategory.getName(),womensWearBaseItemCategory);
    }

    public static ItemCategory getBaseItemCategory(String categoryName) {
        ItemCategory baseItemCategory = baseItemCategoryMap.get(categoryName);
        return baseItemCategory;
    }
}
