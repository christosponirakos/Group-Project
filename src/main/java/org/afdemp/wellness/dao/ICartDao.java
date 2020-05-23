package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Cart;


public interface ICartDao {
    
    public List<Cart> findAllCarts();
    public Cart findById(int id);
    public boolean save(Cart cart);
    public boolean delete(int id);
    public boolean update(Cart cart);
}
