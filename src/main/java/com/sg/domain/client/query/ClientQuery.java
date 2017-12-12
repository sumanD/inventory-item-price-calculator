package com.sg.domain.client.query;

import com.sg.domain.Item;

import java.util.List;

public class ClientQuery {
    private int numberOfQueries;
    private List<Item> itemList;

    public int getNumberOfQueries() {
        return numberOfQueries;
    }

    public void setNumberOfQueries(int numberOfQueries) {
        this.numberOfQueries = numberOfQueries;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "ClientQuery{" +
                "numberOfQueries=" + numberOfQueries +
                ", itemList=" + itemList +
                '}';
    }
}
