package main.java.com.sg.domain.factory;

public class CategoryFactoryRequest {
    private String categoryName;

    public CategoryFactoryRequest(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
