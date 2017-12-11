package main.java.com.sg.domain;

public class Discount {
    private int discountPercent;

    public Discount() {
    }

    public Discount(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountPercent=" + discountPercent +
                '}';
    }
}
