package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Cart;


public interface ICartService {
    
    public List<Cart> findAllCarts();
    public Cart findById(long id);
    public boolean save(Cart cart);
    public boolean delete(long id);
    public boolean update(Cart cart);
}
