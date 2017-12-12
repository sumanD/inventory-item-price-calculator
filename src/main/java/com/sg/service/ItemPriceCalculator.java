package com.sg.service;

import com.sg.domain.Item;
import com.sg.exception.ItemValidationException;

import java.util.List;

/**
 * Interface to capture final item price calculation operations.
 *
 */
public interface ItemPriceCalculator {
    int getFinalPrice(List<Item> items) throws ItemValidationException;
}
