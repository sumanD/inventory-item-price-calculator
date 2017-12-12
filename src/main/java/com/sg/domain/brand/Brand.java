package com.sg.domain.brand;

import com.sg.domain.Discount;

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
