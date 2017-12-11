package main.java.com.sg.service;

import main.java.com.sg.domain.Item;
import main.java.com.sg.exception.ItemValidationException;

import java.util.List;

public interface ItemPriceCalculator {
    public int getFinalPrice(List<Item> items) throws ItemValidationException;
}
