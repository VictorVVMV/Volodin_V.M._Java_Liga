package com.Lesson4Service.ServiceL4.objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;
/*
    Класс Заказ, содержит поля: id, название, цена.
 */
@EntityScan
public class Order {

    private Long id;

    private String name;

    private int price;

    public Order(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Order() {
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
