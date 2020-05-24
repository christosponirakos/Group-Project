/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.entities.Contactform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.afdemp.wellness.dao.ContactformsDaoImpl;
/**
 *
 * @author ticho
 */
@Service("contactFormsService")
@Transactional
public class ContactformsServiceImpl implements IContactformsService {
     @Autowired
    ContactformsDaoImpl dao;
     
    @Override
    public List<Contactform> findAllContactforms() {
      List<Contactform> contactForms = dao.findAll();
        if (contactForms.size() == 0) {
            //oops something went wrong---> sout ???out.print ???
            return null;

        }
        return contactForms;
    }

    @Override
    public Contactform findById(int id) {
      if (id <= 0) {
            return null;

        } else {
            return dao.findById(id);
        }
    }

    @Override
    public boolean save(Contactform contactform) {
        return dao.save(contactform);
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
    public boolean update(Contactform contactform) {
//         int id=contactform.getId();     ---> incompatible types int id-long!!!!!!!!!!
//        contactform = findBy(id);
//        if (contactform != null) {
//            dao.update(contactform);
//            return true;
//        } else {
//            return false;
//        }
    return false; //για να μη χτυπαει μεχρι να φτιαξουμε το long ing 
    }
    
    
}
