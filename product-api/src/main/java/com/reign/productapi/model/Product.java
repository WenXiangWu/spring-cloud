package com.reign.productapi.model;

/**
 * @ClassName: Product
 * @Description: TODO
 * @Author: wuwx
 * @Date: 2020-07-15 09:57
 **/

public class Product {

    private String name;

    private Double price;

    private String info;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                '}';
    }

    public Product() {
    }

    public Product(String name, Double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
