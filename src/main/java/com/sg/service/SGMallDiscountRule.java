package com.sg.service;

import com.sg.domain.Item;
import com.sg.domain.category.ItemCategory;
import com.sg.exception.ItemValidationException;

/**
 * Maximum discount percentage calculation implementation for an Item.
 *
 * Maximum discount is calculated by comparing the Brand discount along with
 * Item Category and its ancestor category's discount
 */
public class SGMallDiscountRule implements DiscountRule{

    /**
     *
     * @param item Item on which discount percent needs to be calculated
     * @return Maximum discount available on this item.
     * @throws ItemValidationException Exception thrown if the item is not proper
     */
    @Override
    public int calculateDiscountPercent(Item item) throws ItemValidationException {

        validateItem(item);

        // Brand Discount
        int brandDiscount = item.getBrand().getDiscount().getDiscountPercent();

        // Item Category Discount
        int itemCategoryDiscount = item.getItemCategory().getDiscount().getDiscountPercent();

        // Ancestor Category Discount
        // We have assumed that the ancestor hierarchy would not be greater than 100 nodes
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

    /**
     * Item validator
     * @param item and Item Object
     * @throws ItemValidationException
     */
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
