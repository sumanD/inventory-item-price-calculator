package com.sg.service.factory;

import com.sg.domain.brand.*;
import com.sg.domain.factory.BrandFactoryRequest;

public final class BrandFactory implements Factory<Brand, BrandFactoryRequest>{

    @Override
    public Brand build(BrandFactoryRequest factoryRequest) {
        Brand brand = null;
        String brandName = factoryRequest.getBrandName();

        if(brandName != null && brandName.length() > 0) {
            switch (brandName) {
                case "Arrow" :
                    brand = new ArrowBrand();
                    break;
                case "Wrangler" :
                    brand = new WranglerBrand();
                    break;
                case "Vero Moda" :
                    brand = new VeroModaBrand();
                    break;
                case "UCB" :
                    brand = new UCBBrand();
                    break;
                case "Adidas" :
                    brand = new AdidasBrand();
                    break;
                case "Provogue" :
                    brand = new ProvogueBrand();
                    break;
            }
        }
        return brand;
    }
}
