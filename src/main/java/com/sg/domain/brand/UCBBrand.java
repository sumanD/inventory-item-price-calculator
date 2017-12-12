package com.sg.domain.brand;

import com.sg.domain.Discount;

public class UCBBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.UCB.brandName();
        discount = new Discount(BrandEnum.UCB.discountInPercent());
    }
}
