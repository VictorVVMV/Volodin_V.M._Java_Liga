package com.Lesson4Service.ServiceL4.repositories;

import com.Lesson4Service.ServiceL4.objects.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OrderDAOTest {

    @Autowired
    OrderDAO  orderDAO;

    @MockBean
    Order order;

    @BeforeAll
    void setUp() {
        orderDAO.save(order);
    }

    @Test
    void save() {
        assertNotNull(order);
    }

    @Test
    void loadAll() {
        List<Order> list = orderDAO.loadAll();
        assertNotNull(list);
    }
}