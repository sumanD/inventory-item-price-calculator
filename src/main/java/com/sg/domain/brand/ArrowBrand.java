package main.java.com.sg.domain.brand;

import main.java.com.sg.domain.Discount;

public class ArrowBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.ARROW.brandName();
        discount = new Discount(BrandEnum.ARROW.discountInPercent());
    }
}
