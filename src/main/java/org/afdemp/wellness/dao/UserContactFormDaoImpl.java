package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.UserContactForm;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("usercontactformDao")
public class UserContactFormDaoImpl extends AbstractDao<Integer, UserContactForm> implements IObjectDao {

    @Override
    public List<UserContactForm> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<UserContactForm>) criteria.list();
    }

    @Override
    public UserContactForm findById(long id) {
        UserContactForm cf = getByKey((int) id);
        if (cf != null) {
            return cf;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        UserContactForm usercontactform = (UserContactForm) entity;
        boolean save = persist(usercontactform);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        UserContactForm ucf = getByKey((int) id);
        if (ucf != null) {
            delete(ucf);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        UserContactForm usercontactform = (UserContactForm) entity;
        UserContactForm ucf = (UserContactForm) findById(usercontactform.getId());
        if (ucf != null) {
            ucf.setUserId(usercontactform.getUserId());
            ucf.setSubject(usercontactform.getSubject());
            ucf.setMessage(usercontactform.getMessage());
            return save(ucf);
        }
        return false;
    }

}
