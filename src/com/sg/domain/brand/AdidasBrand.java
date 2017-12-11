package com.sg.domain.brand;

import com.sg.domain.Discount;

public class AdidasBrand extends Brand{

    @Override
    protected void construct() {
        super.brandName = BrandEnum.ADIDAS.brandName();
        super.discount = new Discount(BrandEnum.ADIDAS.discountInPercent());
    }
}
