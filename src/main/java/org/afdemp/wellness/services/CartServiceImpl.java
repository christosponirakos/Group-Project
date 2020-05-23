///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package org.afdemp.wellness.services;
//
//import java.util.List;
//import org.afdemp.wellness.entities.Cart;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.afdemp.wellness.dao.CartDaoImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// *
// * @author ticho
// */
//@Service("cartService")
//@Transactional
//public class CartServiceImpl implements ICartService{
//     @Autowired
//    CartDaoImpl dao;
//    
//    
//    @Override
//    public List<Cart> findAllCarts() {
//          List<Cart> carts = dao.findAll();
//        return carts;
//    }
//
//    @Override
//    public Cart findById(int id) {
//        return dao.findById(id);
//    }
//
//    @Override
//    public boolean save(Cart cart) {
//        return dao.save(cart);
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return dao.delete(id);
//    }
//
//    @Override
//    public boolean update(Cart cart) {
//        dao.update(cart);
//        return true;
//    }
//    
//}
