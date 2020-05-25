package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.ContactForm;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("contactformDao")
public class ContactFormDaoImpl extends AbstractDao<Integer, ContactForm> implements IObjectDao {

    @Override
    public List<ContactForm> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<ContactForm>) criteria.list();
    }

    @Override
    public ContactForm findById(long id) {
        ContactForm cf = getByKey((int) id);
        if (cf != null) {
            return cf;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        ContactForm contactform = (ContactForm) entity;
        boolean save = persist(contactform);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        ContactForm cf = getByKey((int) id);
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
        ContactForm contactform = (ContactForm) entity;
        ContactForm cf = (ContactForm) findById(contactform.getId());
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
