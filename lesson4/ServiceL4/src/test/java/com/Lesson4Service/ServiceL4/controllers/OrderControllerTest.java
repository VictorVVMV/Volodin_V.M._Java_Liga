package com.Lesson4Service.ServiceL4.controllers;

import com.Lesson4Service.ServiceL4.objects.Customer;
import com.Lesson4Service.ServiceL4.objects.Order;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {

    @Autowired
    OrderController oc;

    @MockBean
    Order o;
    @MockBean
    Customer u;

    @Test
    void userUpdate() {
        assertNotNull(oc.userUpdate(u.getName(),u.getEmail(), o.getName(), o.getPrice()));
    }
}