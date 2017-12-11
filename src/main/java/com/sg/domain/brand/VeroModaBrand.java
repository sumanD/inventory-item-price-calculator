package main.java.com.sg.domain.brand;

import main.java.com.sg.domain.Discount;

public class VeroModaBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.VEROMODA.brandName();
        discount = new Discount(BrandEnum.VEROMODA.discountInPercent());
    }
}
