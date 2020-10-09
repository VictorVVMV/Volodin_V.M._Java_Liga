package com.Lesson4Service.ServiceL4.objects;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Autowired
    Customer u;

    @BeforeAll
    void setUp() {
        u.setEmail("email");
        u.setName("name");
    }

    @Test
    void getName() {
        assertNotNull(u.getName());
    }

    @Test
    void toString1() {
        assertNotNull(u.toString());
    }

    @Test
    void setName() {
        assertNotNull(u.getName());
    }

    @Test
    void getEmail() {
        assertNotNull(u.getEmail());
    }

    @Test
    void setEmail() {
        assertNotNull(u.getEmail());
    }
}