package com.sg.service;

import com.sg.domain.Item;
import com.sg.exception.ItemValidationException;

import java.util.List;

public interface ItemPriceCalculator {
    public int getFinalPrice(List<Item> items) throws ItemValidationException;
}
