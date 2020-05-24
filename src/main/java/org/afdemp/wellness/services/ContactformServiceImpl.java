/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.entities.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.afdemp.wellness.dao.ContactFormDaoImpl;
/**
 *
 * @author ticho
 */
@Service("contactFormsService")
@Transactional
public class ContactformServiceImpl implements IContactformService {
     @Autowired
    ContactFormDaoImpl dao;
     
    @Override
    public List<ContactForm> findAllContactforms() {
      List<ContactForm> contactForms = dao.findAll();
        if (contactForms.size() == 0) {
            //oops something went wrong---> sout ???out.print ???
            return null;

        }
        return contactForms;
    }

    @Override
    public ContactForm findById(long id) {
      if (id <= 0) {
            return null;

        } else {
            return dao.findById(id);
        }
    }

    @Override
    public boolean save(ContactForm contactform) {
        return dao.save(contactform);
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
    public boolean update(ContactForm contactform) {
       
        contactform = findById(contactform.getId());
        if (contactform != null) {
            dao.update(contactform);
            return true;
        } else {
            return false;
        }
    }
    
    
}
