package com.sg.domain.brand;

import com.sg.domain.Discount;

/**
 * Abstract class to represent a Brand
 * Specific Brands are implemented in respective class
 */
public abstract class Brand {
    protected String brandName;
    protected Discount discount;

    public Brand() {
        construct();
    }

    protected abstract void construct();

    public final String getBrandName() {
        return brandName;
    }
    public final Discount getDiscount() {
        return discount;
    }
}
