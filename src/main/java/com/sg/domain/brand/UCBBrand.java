package main.java.com.sg.domain.brand;

import main.java.com.sg.domain.Discount;

public class UCBBrand extends Brand{

    @Override
    protected void construct() {
        brandName = BrandEnum.UCB.brandName();
        discount = new Discount(BrandEnum.UCB.discountInPercent());
    }
}
