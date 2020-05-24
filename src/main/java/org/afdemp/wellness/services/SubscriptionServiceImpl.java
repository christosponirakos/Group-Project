/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.ISubscriptionDao;
import org.afdemp.wellness.entities.Subscription;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Chris
 */
public class SubscriptionServiceImpl implements ISubscriptionService {

    @Autowired
    private ISubscriptionDao dao;

    public List<Subscription> findAllSubscriptions() {
        return dao.findAllSubscriptions();
    }

    public Subscription findById(int id) {
        if (id <= 0) {
            return null;
        } else {
            return dao.findById(id);
        }
    }

    public boolean save(Subscription subscription) {
        return dao.save(subscription);
    }

    public boolean delete(int id) {
        if (findById(id) != null) {
            return dao.delete(id);
        } else {
            return false;
        }
    }

    
    public boolean updateById(int id, Subscription subscription) {
        if (findById(id) != null) {
            return dao.update(subscription);
        } else {
            return false;
        }
    }
}
