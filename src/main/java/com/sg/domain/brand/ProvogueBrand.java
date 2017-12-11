package main.java.com.sg.domain.brand;

import main.java.com.sg.domain.Discount;

public class ProvogueBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.PROVOGUE.brandName();
        discount = new Discount(BrandEnum.PROVOGUE.discountInPercent());
    }
}
