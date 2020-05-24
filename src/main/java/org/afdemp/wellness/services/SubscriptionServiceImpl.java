/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.SubscriptionDaoImpl;
import org.afdemp.wellness.entities.Subscription;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Chris
 */
public class SubscriptionServiceImpl implements ISubscriptionService {

    @Autowired
    private SubscriptionDaoImpl dao;

    public List<Subscription> findAllSubscriptions() {
        return dao.findAll();
    }

    public Subscription findById(long id) {
        if (id <= 0) {
            return null;
        } else {
            return dao.findById(id);
        }
    }

    public boolean save(Subscription subscription) {
        return dao.save(subscription);
    }

    public boolean delete(long id) {
        if (findById(id) != null) {
            return dao.delete(id);
        } else {
            return false;
        }
    }

    
    public boolean updateById(Subscription subscription) {
        if (findById(subscription.getId()) != null) {
            return dao.update(subscription);
        } else {
            return false;
        }
    }
}
