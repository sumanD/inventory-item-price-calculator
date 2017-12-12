package com.sg.service.factory;

import com.sg.domain.brand.Brand;
import com.sg.domain.brand.*;
import com.sg.domain.factory.BrandFactoryRequest;

/**
 * Factory class for Brand Object creation
 */
public final class BrandFactory implements Factory<Brand, BrandFactoryRequest>{

    @Override
    public Brand build(BrandFactoryRequest factoryRequest) {
        Brand brand = null;
        String brandName = factoryRequest.getBrandName();

        if(brandName != null && brandName.length() > 0) {
            brandName = brandName.trim();

            if(brandName.equalsIgnoreCase("Arrow")) {
                brand = new ArrowBrand();
            }
            else if(brandName.equalsIgnoreCase("Wrangler")) {
                brand = new WranglerBrand();
            }
            else if(brandName.equalsIgnoreCase("Vero Moda")) {
                brand = new VeroModaBrand();
            }
            else if(brandName.equalsIgnoreCase("UCB")) {
                brand = new UCBBrand();
            }
            else if(brandName.equalsIgnoreCase("Adidas")) {
                brand = new AdidasBrand();
            }
            else if(brandName.equalsIgnoreCase("Provogue")) {
                brand = new ProvogueBrand();
            }
        }
        return brand;
    }
}
