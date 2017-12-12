package com.sg.service;

import com.sg.domain.Item;
import com.sg.exception.ItemValidationException;

import java.util.List;

/**
 * Final Item price calculator
 */
public class SGItemPriceCalculator implements ItemPriceCalculator {

    private DiscountRule discountRule;

    public SGItemPriceCalculator(DiscountRule discountRule) {
        this.discountRule = discountRule;
    }

    /**
     *  Calculates the Sum of all the Items considering the Brand and Item Category level discounts
     * @param items Item List (1 or more than one Item) which final price (after discount) sum is required
     * @return Final(Sum) price (cost) of these items
     * @throws ItemValidationException
     */
    @Override
    public int getFinalPrice(List<Item> items) throws ItemValidationException {
        int total = 0;

        if(items != null && items.size() > 0) {
            for (Item item : items) {
                if(item != null) {
                    int itemPrice = item.getItemPrice();
                    int discount = discountRule.calculateDiscountPercent(item);

                    int itemTotal = (itemPrice * (100 - discount))/100;
                    total += itemTotal;
                }
            }
        }

        return total;
    }
}
