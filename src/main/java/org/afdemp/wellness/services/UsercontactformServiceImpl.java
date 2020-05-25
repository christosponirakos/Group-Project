/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.UserContactFormDaoImpl;
import org.afdemp.wellness.entities.UserContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ticho
 */
@Service("userContactFormService")
@Transactional
public class UsercontactformServiceImpl implements IUsercontactformService{
    
    @Autowired
    UserContactFormDaoImpl dao;

    @Override
    public List<UserContactForm> findAllUsercontactforms() {
          List<UserContactForm> userContactForms = dao.findAll();
        if (userContactForms.size() == 0) {
            //oops something went wrong---> sout ???out.print ???
            return null;

        }
        return userContactForms;
    }

    @Override
    public UserContactForm findById(long id) {
           if (id <= 0) {
            return null;

        } else {
            return dao.findById(id);
        }
    }

    @Override
    public boolean save(UserContactForm usercontactform) {
          return dao.save(usercontactform);
    }

    @Override
    public boolean delete(long id) {
     if (id <= 0) {

        return false;
    } else {

        return dao.delete(id);
    }
    }

    @Override
    public boolean update(UserContactForm usercontactform) {
         usercontactform = findById(usercontactform.getId());
        if (usercontactform != null) {
            dao.update(usercontactform);
            return true;
        } else {
            return false;
        }
    }
    
}
