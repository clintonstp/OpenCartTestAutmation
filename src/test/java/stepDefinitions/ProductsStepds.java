package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.ProductsPageObjects;

import java.io.IOException;

public class ProductsStepds {
    ProductsPageObjects productsPageObjects = new ProductsPageObjects();

    public ProductsStepds() throws IOException {
    }

    @And("a T-shirt to add to cart")
    public void aTShirtToAddToCart() {
        productsPageObjects.selectTShirt();

    }
}
