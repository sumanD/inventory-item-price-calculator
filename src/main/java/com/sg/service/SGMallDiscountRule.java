package com.sg.service;

import com.sg.domain.Item;
import com.sg.domain.category.ItemCategory;
import com.sg.exception.ItemValidationException;

public class SGMallDiscountRule implements DiscountRule{

    @Override
    public int calculateDiscountPercent(Item item) throws ItemValidationException {

        validateItem(item);

        // Brand Discount
        int brandDiscount = item.getBrand().getDiscount().getDiscountPercent();

        // Item Category Discount
        int itemCategoryDiscount = item.getItemCategory().getDiscount().getDiscountPercent();

        // Ancestor Category Discount

        int [] priceArr = new int [100];
        int i = 0;

        priceArr[i++] = brandDiscount;
        priceArr[i++] =itemCategoryDiscount;

        ItemCategory ancestor = item.getItemCategory().getParentCategory();
        while (ancestor != null) {
            priceArr[i] = ancestor.getDiscount().getDiscountPercent();
            ancestor = ancestor.getParentCategory();
            i++;
        }

        // Getting highest discount percent
        int max = 0;
        for (int j = 0; j<100; j++) {
            if(priceArr[j] > max) {
                max = priceArr[j];
            }
        }

        return max;
    }

    private void validateItem(Item item) throws ItemValidationException{
        if(item == null) {
            throw new ItemValidationException("Item is null");
        }

        if(item.getItemPrice() < 0) {
            throw new ItemValidationException("Item price is negative");
        }

        if(item.getBrand() == null
                || item.getBrand().getDiscount() == null
                || item.getBrand().getDiscount().getDiscountPercent() < 0) {
            throw new ItemValidationException("Item Brand is null / Brand discount is negative");
        }

        if(item.getItemCategory() == null
                || item.getItemCategory().getDiscount() == null
                || item.getItemCategory().getDiscount().getDiscountPercent() < 0) {
            throw new ItemValidationException("Item Category is null / Category discount is negative");
        }
    }
}
