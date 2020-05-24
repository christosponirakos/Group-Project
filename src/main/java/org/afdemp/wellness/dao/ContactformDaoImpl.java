package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Contactform;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("contactformDao")
public class ContactformDaoImpl extends AbstractDao<Integer, Contactform> implements IObjectDao {

    @Override
    public List<Contactform> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Contactform>) criteria.list();
    }

    @Override
    public Contactform findById(long id) {
        Contactform cf = getByKey((int) id);
        if (cf != null) {
            return cf;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Contactform contactform = (Contactform) entity;
        boolean save = persist(contactform);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Contactform cf = getByKey((int) id);
        if (cf != null) {
            delete(cf);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Contactform contactform = (Contactform) entity;
        Contactform cf = (Contactform) findById(contactform.getId());
        if (cf != null) {
            cf.setName(contactform.getName());
            cf.setEmail(contactform.getEmail());
            cf.setSubject(contactform.getSubject());
            cf.setMessage(contactform.getMessage());
            return save(cf);
        }
        return false;
    }

}
