package com.Lesson4Service.ServiceL4.controllers;

import com.Lesson4Service.ServiceL4.objects.Customer;
import com.Lesson4Service.ServiceL4.objects.Order;
import com.Lesson4Service.ServiceL4.repositories.OrderDAO;
import com.Lesson4Service.ServiceL4.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


/*
    Контроллер, который принимает Json POST запросы
 */
@Component
@RestController
public class OrderController {
    /*
        Переменная для работы с базой данных заказов
     */
    @Autowired
    private OrderDAO orderDAO = new OrderDAO();
    /*
        Метод, который принимает Json POST запросы
     */
    @PostMapping("/user")
    public Map<Customer, Order> userUpdate(@RequestParam(value="name") String name,
                                           @RequestParam(value="email") String email,
                                           @RequestParam(value="orderName") String orderName,
                                           @RequestParam(value="orderPrice") int price){
        OrderService os = new OrderService(new Customer(name,email), new Order(orderName, price), orderDAO);
        return os.getUserAndOrder();
    }
}
