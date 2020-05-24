/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.wellness.services;

import java.util.List;
import org.afdemp.wellness.dao.TypeDaoImpl;

import org.afdemp.wellness.entities.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ticho
 */
@Service("typeService")
@Transactional
public class TypeServiceImpl implements ITypeService {

    @Autowired
    TypeDaoImpl dao;

    @Override
    public List<Type> findAllTypes() {
        List<Type> types = dao.findAll();
        if (types.size() == 0) {
            //oops something went wrong---> sout ???out.print ???
            return null;

        }
        return types;
    }

    @Override
    public Type findById(long id) {
        if (id <= 0) {
            return null;

        } else {
            return dao.findById(id);
        }
    }

    @Override
    public boolean save(Type type) {
        return dao.save(type);
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
    public boolean update(Type type) {
       
        type= findById(type.getId());
        if (type != null) {
            dao.update(type);
            return true;
        } else {
            return false;
        }
    }
       
}
