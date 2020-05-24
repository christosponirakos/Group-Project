package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Order;


public interface IOrdersService {
    
    public List<Order> findAllOrders();
    public Order findById(long id);
    public boolean save(Order order);
    public boolean delete(long id);
    public boolean updateById(Order order);
}
