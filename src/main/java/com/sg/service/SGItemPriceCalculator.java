package com.sg.service;

import com.sg.domain.Item;
import com.sg.exception.ItemValidationException;

import java.util.List;

public class SGItemPriceCalculator implements ItemPriceCalculator {

    private DiscountRule discountRule;

    public SGItemPriceCalculator(DiscountRule discountRule) {
        this.discountRule = discountRule;
    }

    @Override
    public int getFinalPrice(List<Item> items) throws ItemValidationException {
        int total = 0;

        for (Item item : items) {
            int itemPrice = item.getItemPrice();
            int discount = discountRule.calculateDiscountPercent(item);

            int itemTotal = (itemPrice * (100 - discount))/100;
            total += itemTotal;
        }
        return total;
    }
}
