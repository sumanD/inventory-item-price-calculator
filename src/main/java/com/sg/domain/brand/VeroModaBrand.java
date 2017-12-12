package com.sg.domain.brand;

import com.sg.domain.Discount;

public class VeroModaBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.VEROMODA.brandName();
        discount = new Discount(BrandEnum.VEROMODA.discountInPercent());
    }
}
