package com.sg.service;

import com.sg.domain.Item;
import com.sg.domain.factory.ItemFactoryRequest;
import com.sg.exception.ItemValidationException;
import com.sg.service.factory.ItemFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SGMallDiscountRuleUnitTest {

    private static ItemFactory itemFactory;
    private static Item item;

    @BeforeClass
    public static void runOnceBeforeClass() {
        itemFactory = new ItemFactory();

        int itemId = 1;
        String brandName = "Arrow";
        String category = "Casuals";
        int price = 800;

        ItemFactoryRequest itemFactoryRequest = new ItemFactoryRequest(itemId,brandName,category,price);
        item = itemFactory.build(itemFactoryRequest);
    }

    @Test
    public void calculateDiscountPercent() throws Exception {
        DiscountRule discountRule = new SGMallDiscountRule();
        int discountPercent = discountRule.calculateDiscountPercent(item);
        Assert.assertEquals(discountPercent,30);
    }

    @Test (expected = ItemValidationException.class)
    public void calculateDiscountPercent_ValidationException_nullItem() throws ItemValidationException {
        DiscountRule discountRule = new SGMallDiscountRule();
        int discountPercent = discountRule.calculateDiscountPercent(null);
    }

    @Test(expected = ItemValidationException.class)
    public void calculateDiscountPercent_ValidationException_EmptyBrand() throws ItemValidationException {
        item.setBrand(null);
        DiscountRule discountRule = new SGMallDiscountRule();
        int discountPercent = discountRule.calculateDiscountPercent(null);
    }
}