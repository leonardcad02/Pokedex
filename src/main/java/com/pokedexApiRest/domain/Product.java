package com.pokedexApiRest.domain;

public class Product {
    private  Integer productId;
    private String name;
    private Integer categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;

    public Integer getProductoId() {
        return productId;
    }

    public void setProductoId(Integer productoId) {
        this.productId = productoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
