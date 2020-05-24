/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.UsercontactformDaoImpl;
import org.afdemp.wellness.entities.Usercontactform;
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
    UsercontactformDaoImpl dao;

    @Override
    public List<Usercontactform> findAllUsercontactforms() {
          List<Usercontactform> userContactForms = dao.findAll();
        if (userContactForms.size() == 0) {
            //oops something went wrong---> sout ???out.print ???
            return null;

        }
        return userContactForms;
    }

    @Override
    public Usercontactform findById(long id) {
           if (id <= 0) {
            return null;

        } else {
            return dao.findById(id);
        }
    }

    @Override
    public boolean save(Usercontactform usercontactform) {
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
    public boolean update(Usercontactform usercontactform) {
         usercontactform = findById(usercontactform.getId());
        if (usercontactform != null) {
            dao.update(usercontactform);
            return true;
        } else {
            return false;
        }
    }
    
}
