package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Order;


public interface IOrderDao {
    
    public List<Order> findAllOrders();
    public Order findById(int id);
    public boolean save(Order order);
    public boolean delete(int id);
    public boolean update(Order order);
}
