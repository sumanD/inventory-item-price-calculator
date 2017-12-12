package com.sg.service;

import com.sg.domain.Item;
import com.sg.domain.factory.ItemFactoryRequest;
import com.sg.service.factory.ItemFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Test class to test Final Item Price Calculations
 *  Added few sample test cases
 */
@RunWith(MockitoJUnitRunner.class)
public class SGItemPriceCalculatorUnitTest {

    @InjectMocks
    private static DiscountRule discountRule = new SGMallDiscountRule();

    private static ItemPriceCalculator itemPriceCalculator;
    private static ItemFactory itemFactory;
    private static Item item;

    @BeforeClass
    public static void runOnceBeforeClass() {
        itemPriceCalculator = new SGItemPriceCalculator(discountRule);
        itemFactory = new ItemFactory();

        int itemId = 1;
        String brandName = "Arrow";
        String category = "Casuals";
        int price = 800;

        ItemFactoryRequest itemFactoryRequest = new ItemFactoryRequest(itemId,brandName,category,price);
        item = itemFactory.build(itemFactoryRequest);
    }

    @Test
    public void getFinalPrice() throws Exception {
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);

        int finalPrice = itemPriceCalculator.getFinalPrice(itemList);
        System.out.println(finalPrice);
    }

}