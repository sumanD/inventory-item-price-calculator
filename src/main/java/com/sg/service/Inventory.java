package main.java.com.sg.service;

import main.java.com.sg.domain.brand.Brand;
import main.java.com.sg.domain.category.ItemCategory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<ItemCategory> baseCategories;
    private List<Brand> brandList;

    public Inventory() {
        baseCategories = new ArrayList<>();
        brandList = new ArrayList<>();
    }
}
