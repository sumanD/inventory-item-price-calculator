package com.sg.service;

import com.sg.domain.Item;
import com.sg.exception.ItemValidationException;

public interface DiscountRule {
    public int calculateDiscountPercent(Item item) throws ItemValidationException;
}
