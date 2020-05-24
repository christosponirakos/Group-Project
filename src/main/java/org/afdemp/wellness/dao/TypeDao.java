package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Type;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("typeDao")
public class TypeDao extends AbstractDao<Integer, Type> implements IObjectDao {

    @Override
    public List<Type> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Type>) criteria.list();
    }

    @Override
    public Type findById(long id) {
        Type t = getByKey((int) id);
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Type type = (Type) entity;
        boolean save = persist(type);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Type u = getByKey((int) id);
        if (u != null) {
            delete(u);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Type type = (Type) entity;
        Type t = (Type) findById(type.getId());
        if (t != null) {
            t.setType(type.getType());
            return save(t);
        }
        return false;
    }
    
}
