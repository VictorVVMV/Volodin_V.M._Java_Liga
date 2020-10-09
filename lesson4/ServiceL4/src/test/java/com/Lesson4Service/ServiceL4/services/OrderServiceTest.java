package com.Lesson4Service.ServiceL4.services;

import com.Lesson4Service.ServiceL4.objects.Customer;
import com.Lesson4Service.ServiceL4.objects.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    OrderService os;

    @MockBean
    Customer u;

    @MockBean
    Order o;

    @Test
    void getUser() {
        os.setCustomer(u);
        assertNotNull(os.getCustomer());
    }

    @Test
    void setUser() {
        os.setCustomer(u);
        assertEquals(os.getCustomer(),u);
    }

    @Test
    void getOrder() {
        os.setOrder(o);
        assertNotNull(os.getOrder());
    }

    @Test
    void setOrder() {
        os.setOrder(o);
        assertEquals(os.getOrder(),o);
    }

    @Test
    void getUserAndOrder() {

        assertNotNull(os.getUserAndOrder());
    }
}