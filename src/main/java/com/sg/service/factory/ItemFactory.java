package main.java.com.sg.service.factory;

import main.java.com.sg.domain.Item;
import main.java.com.sg.domain.brand.Brand;
import main.java.com.sg.domain.category.ItemCategory;
import main.java.com.sg.domain.factory.BrandFactoryRequest;
import main.java.com.sg.domain.factory.CategoryFactoryRequest;
import main.java.com.sg.domain.factory.ItemFactoryRequest;

public final class ItemFactory implements Factory<Item, ItemFactoryRequest>{

    private BrandFactory brandFactory;
    private CategoryFactory categoryFactory;

    private ItemFactory() {
        this.brandFactory = new BrandFactory();
        this.categoryFactory = new CategoryFactory();
    }

    @Override
    public Item build(ItemFactoryRequest factoryRequest) {
        Item item = null;

        if(factoryRequest != null ){
            // Item Id
            int itemId = factoryRequest.getItemId();

            // Item Price
            int itemPrice = factoryRequest.getPrice();

            // Item Brand
            String brandName = factoryRequest.getBrandName();
            BrandFactoryRequest brandFactoryRequest = new BrandFactoryRequest(brandName);
            Brand brand = brandFactory.build(brandFactoryRequest);

            // Item Category
            String categoryName = factoryRequest.getCategoryName();
            CategoryFactoryRequest categoryFactoryRequest = new CategoryFactoryRequest(categoryName);
            ItemCategory category = categoryFactory.build(categoryFactoryRequest);

            item = new Item(itemId, itemPrice, brand, category);
        }
        return item;
    }
}
