package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Order;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao<Integer, Order> implements IObjectDao {

    @Override
    public List<Order> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Order>) criteria.list();
    }

    @Override
    public Order findById(long id) {
        Order o = getByKey((int) id);
        if (o != null) {
            return o;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Order order = (Order) entity;
        boolean save = persist(order);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Order o = getByKey((int) id);
        if (o != null) {
            delete(o);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Order order = (Order) entity;
        Order o = (Order) findById(order.getId());
        if (o != null) {
            o.setProductId(order.getProductId());
            o.setUserId(order.getUserId());
            return save(o);
        }
        return false;
    }

}
