package com.sg.domain.factory;

public class BrandFactoryRequest {
    private String brandName;

    public BrandFactoryRequest(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}
