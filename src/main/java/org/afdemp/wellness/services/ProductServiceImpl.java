/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.ProductDaoImpl;
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
    ProductDaoImpl dao;
    
    public List<Product> findAllProducts() {
        return dao.findAll();
    }

    
    public Product findById(long id) {
        if(id <= 0){
            return null;
        }else {
            return dao.findById(id);
        }
    }

    
    public boolean save(Product product) {
       return dao.save(product);
    }


    public boolean delete(long id) {
        if(id <= 0){
            return false;
        }else{
            return dao.delete(id);
        }
        
    }

    public boolean updateById(Product product) {
        if (findById(product.getId()) != null) {
            return dao.update(product);
        } else {
            return false;
        }
    }
}
