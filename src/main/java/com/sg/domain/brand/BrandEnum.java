package main.java.com.sg.domain.brand;

public enum BrandEnum {
    WRANGLER("Wrangler",10),
    ARROW("Arrow",20),
    VEROMODA("Vero Moda",60),
    UCB("UCB",0),
    ADIDAS("Adidas",5),
    PROVOGUE("Provogue",20);

    private String brandName;
    private int discountInPercent;

    BrandEnum(String brandName, int discountInPercent) {
        this.brandName = brandName;
        this.discountInPercent = discountInPercent;
    }

    public String brandName() {
        return this.brandName;
    }

    public int discountInPercent() {
        return this.discountInPercent;
    }
}
