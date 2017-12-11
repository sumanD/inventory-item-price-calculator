package main.java.com.sg.domain.brand;

import main.java.com.sg.domain.Discount;

public class WranglerBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.WRANGLER.brandName();
        discount = new Discount(BrandEnum.WRANGLER.discountInPercent());
    }
}
