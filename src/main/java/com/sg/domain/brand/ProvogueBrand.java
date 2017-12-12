package com.sg.domain.brand;

import com.sg.domain.Discount;

public class ProvogueBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.PROVOGUE.brandName();
        discount = new Discount(BrandEnum.PROVOGUE.discountInPercent());
    }
}
