/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.entities.Cart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.afdemp.wellness.dao.CartDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ticho
 */
@Service("cartService")
@Transactional
public class CartServiceImpl implements ICartService {

    @Autowired
    CartDaoImpl dao;

    @Override
    public List<Cart> findAllCarts() {
        List<Cart> carts = dao.findAll();
        if (carts.size() == 0) {
            //oops something went wrong---> sout ???out.print ???
            return null;

        }
        return carts;
    }

    @Override
    public Cart findById(int id) {
        if (id <= 0) {
            return null;

        } else {
            return dao.findById(id);
        }
    }

    @Override
    public boolean save(Cart cart) {
        return dao.save(cart);
    }

    @Override
    public boolean delete(int id) {
        if (id <= 0) {

            return false;
        } else {

            return dao.delete(id);
        }
    }

    @Override
    public boolean update(Cart cart) {
//         int id=cart.getId();     ---> incompatible types int id-long!!!!!!!!!!
//        cart = findBy(id);
//        if (cart != null) {
//            dao.update(cart);
//            return true;
//        } else {
//            return false;
//        }
        return false;   //για να μη χτυπαει μεχρι να φτιαξουμε το long ing 
    }

}
