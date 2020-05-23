/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.IProductDao;
import org.afdemp.wellness.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Chris
 */
@Service("productService")
@Transactional
public class ProductServiceImpl implements IProductService{
    
    @Autowired
    IProductDao dao;
    
    public List<Product> findAllProducts() {
        return dao.findAllProducts();
    }

    
    public Product findById(int id) {
        return dao.findById(id);
    }

    
    public boolean save(Product product) {
       return dao.save(product);
    }


    public boolean delete(int id) {
        return dao.delete(id);
    }

    //adding the rest of the properties
    //checking if updated?
    public boolean update(Product product) {
        product.setCartList(cartList);
        dao.update(product);
        return true;
        
    }
    
}
