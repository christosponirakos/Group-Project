package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Type;


public interface ITypeService {
    public List<Type> findAllTypes();
    public Type findById(int id);
    public boolean save(Type type);
    public boolean delete(int id);
    public boolean update(Type type);
}
