package com.Lesson4Service.ServiceL4.repositories;

import com.Lesson4Service.ServiceL4.objects.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/*
    Класс для работы с базой данных заказов
 */
@Repository
public class OrderDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /*
    Метод сохранения заказа в БД
    */
    public void save(Order order) {
        String sql = "insert into ORDERS (ORDER_NAME, PRICE) values (?, ?)";
        jdbcTemplate.update(sql, order.getName(), order.getPrice());
    }
    /*
    Метод выгрузки заказов из БД
    */
    public List<Order> loadAll() {
        return jdbcTemplate.query("select * from Orders", (resultSet, i) -> {
            return toOrder(resultSet);
        });
    }
    /*
    Метод приведения полученной информации из БД к виду Order
    */
    private Order toOrder(ResultSet resultSet) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getLong("ID"));
        order.setName(resultSet.getString("ORDER_NAME"));
        order.setPrice(resultSet.getInt("PRICE"));
        return order;
    }
}
