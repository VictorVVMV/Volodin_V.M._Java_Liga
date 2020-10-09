package com.Lesson4Service.ServiceL4.services;

import com.Lesson4Service.ServiceL4.exceptions.NotFoundException;
import com.Lesson4Service.ServiceL4.objects.Customer;
import com.Lesson4Service.ServiceL4.objects.Order;
import com.Lesson4Service.ServiceL4.repositories.OrderDAO;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
    /*
       Класс обработки заказов и покупателей
   */
public class OrderService {
    private Customer customer;
    private Order order;
    private List<Order> list = new ArrayList<>();
    private Map<Customer, Order> map = new Hashtable<>();
    private OrderDAO orderDAO;

    public OrderService(Customer customer, Order order, OrderDAO orderDAO) {
        this.customer = customer;
        this.order = order;
        this.orderDAO = orderDAO;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    /*
    Метод, в котором происходит сохранение и выгрузка заказов из БД. Возвращает карту с покупателем в качестве ключа и
    заказом в качестве значения
    */
    public Map<Customer, Order> getUserAndOrder() throws NotFoundException {
        if (order!=null){
            orderDAO.save(order);
            list = orderDAO.loadAll();
            for (Order o: list) {
                if(o.getName().equals(order.getName()) && o.getPrice() == order.getPrice()){
                    map.put(customer, o);
                }
            }
            return map;
        }else{
            throw new NotFoundException();
        }
    }
}
