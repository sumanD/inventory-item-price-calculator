package com.sg.domain.brand;

import com.sg.domain.Discount;

public class WranglerBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.WRANGLER.brandName();
        discount = new Discount(BrandEnum.WRANGLER.discountInPercent());
    }
}
