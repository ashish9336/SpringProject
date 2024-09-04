package com.lcwd.orm.learn_spring_orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_product")
public class Product {
    @Id
    private String pId;
    private String productName;
    private double price;

    @ManyToMany(mappedBy = "products",fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();

    public Product(String pId, String productName, double price, List<Category> categories) {
        this.pId = pId;
        this.productName = productName;
        this.price = price;
        this.categories = categories;
    }

    public Product() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
