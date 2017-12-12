package com.sg.service;

import com.sg.domain.Item;
import com.sg.domain.brand.Brand;
import com.sg.domain.factory.ItemFactoryRequest;
import com.sg.exception.ItemValidationException;
import com.sg.exception.wrongInputException;
import com.sg.service.factory.ItemFactory;

import java.util.*;

public class Main {

    private static ItemFactory itemFactory;
    private static ItemPriceCalculator itemPriceCalculator;

    static {
        itemFactory = new ItemFactory();
        itemPriceCalculator = new SGItemPriceCalculator(new SGMallDiscountRule());
    }

    public static void main(String[] args) throws wrongInputException, ItemValidationException {
        Map<String,Item> itemMap = new HashMap<>();

        // Get Item List from Command LINE

        Scanner scanner = new Scanner(System.in);

        // Number of Inventory Items
        int noOfInventoryItems = scanner.nextInt();
        scanner.nextLine();
        System.out.println("noOfInventoryItems = " + noOfInventoryItems);

        for(int i=0; i<noOfInventoryItems ; i++) {
            // Get Items
            System.out.println("Getting Lines - ");
            String lineItem = scanner.nextLine();
            System.out.println("lineItem = " + lineItem);
            Item item = parseItem(lineItem);
            String itemId = item.getItemId()+"";
            itemMap.put(itemId,item);
        }

        // Construct InventoryDataFromRequest

        System.out.println("Test Cases - ");
        int testCases = scanner.nextInt();
        scanner.nextLine();
        System.out.println("testCases = " + testCases);

        for(int j = 0; j < testCases; j++) {
            List<Item> itemList = new ArrayList<>();
            System.out.println("Getting Test Lines - ");
            String itemListString = scanner.nextLine();
            System.out.println("TestLine = "+ itemListString);

            String [] itemIdArr = itemListString.split(",");

            int totalPrice = 0;
            for (String itemString : itemIdArr) {
                Item item = itemMap.get(itemString);
                itemList.add(item);
            }

            totalPrice = itemPriceCalculator.getFinalPrice(itemList);
            System.out.println(totalPrice);
        }
    }

    private static Item parseItem(String itemString) throws wrongInputException {
        Item item = null;

        String [] itemArr = itemString.split(",");

        if(itemArr.length == 4) {
            int itemId = Integer.parseInt(itemArr[0]);
            String brandName = itemArr[1];
            String category = itemArr[2];
            int price = Integer.parseInt(itemArr[3]);

            ItemFactoryRequest itemFactoryRequest = new ItemFactoryRequest(itemId,brandName,category,price);
            item = itemFactory.build(itemFactoryRequest);
        }
        else {
            throw new wrongInputException();
        }
        return item;
    }
}
