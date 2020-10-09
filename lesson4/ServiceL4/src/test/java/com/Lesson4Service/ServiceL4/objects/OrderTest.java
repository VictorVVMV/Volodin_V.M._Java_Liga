package com.Lesson4Service.ServiceL4.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Autowired
    Order o;

    @BeforeEach
    void setUp() {
        o.setId(11111l);
        o.setName("name");
        o.setPrice(12345);
    }

    @Test
    void getName() {
        assertNotNull(o.getName());
    }

    @Test
    void getId() {
        assertNotNull(o.getId());
    }

    @Test
    void setId() {
        assertNotNull(o.getId());
    }

    @Test
    void setName() {
        assertNotNull(o.getName());
    }

    @Test
    void getPrice() {
        assertNotNull(o.getPrice());
    }

    @Test
    void setPrice() {
        assertNotNull(o.getPrice());
    }
}