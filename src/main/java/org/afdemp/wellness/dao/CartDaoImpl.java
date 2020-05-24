package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Cart;
import org.afdemp.wellness.entities.Product;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("cartDao")
public class CartDaoImpl extends AbstractDao<Integer, Cart> implements IObjectDao {

    // find all products per user_id
//    String query = "SELECT product_id FROM `cart` WHERE `user_id` = '" + email + "';";
    
    
    @Override
    public List<Product> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
    }

    
    
    @Override
    public Cart findById(long id) {
        Cart c = getByKey((int) id);
        if (c != null) {
            return c;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Cart cart = (Cart) entity;
        boolean save = persist(cart);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Cart c = getByKey((int) id);
        if (c != null) {
            delete(c);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Cart cart = (Cart) entity;
        Cart c = (Cart) findById(cart.getId());
        if (c != null) {
            c.setUserId(cart.getUserId());
            c.setProductId(cart.getProductId());
            return save(c);
        }
        return false;
    }

}
