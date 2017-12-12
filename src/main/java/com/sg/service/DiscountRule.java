package com.sg.service;

import com.sg.domain.Item;
import com.sg.exception.ItemValidationException;

/**
 * Interface to calculate discount rules at the category as well as Brand Level
 */
public interface DiscountRule {
    public int calculateDiscountPercent(Item item) throws ItemValidationException;
}
