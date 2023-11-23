package com.product.product.model;

import java.util.Objects;

public class Product {

    private String productName;
    private String productSpecification;
    private String productId;

    public Product(String productName, String productSpecification, String productId) {
        this.productName = productName;
        this.productSpecification = productSpecification;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) && Objects.equals(productSpecification, product.productSpecification) && Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productSpecification, productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productSpecification='" + productSpecification + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}
