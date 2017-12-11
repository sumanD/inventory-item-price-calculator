package main.java.com.sg.service;

import main.java.com.sg.domain.Item;
import main.java.com.sg.exception.ItemValidationException;

public interface DiscountRule {
    public int calculateDiscountPercent(Item item) throws ItemValidationException;
}
