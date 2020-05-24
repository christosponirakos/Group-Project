/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.OrderDaoImpl;
import org.afdemp.wellness.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Chris
 */
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrderDaoImpl dao;

    public List<Order> findAllOrders() {
        return dao.findAll();
    }

    public Order findById(long id) {
        if (id <= 0) {
            return null;
        } else {
            return dao.findById(id);
        }
    }

    public boolean save(Order order) {
        return dao.save(order);
    }

    public boolean delete(long id) {
        if (id <= 0) {
            return false;
        } else {
            return dao.delete(id);
        }
    }

    public boolean updateById(Order order) {
        if (findById(order.getId()) != null) {
            return dao.update(order);
        } else {
            return false;
        }
    }

}
