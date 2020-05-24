package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Usercontactform;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("usercontactformDao")
public class UsercontactformDaoImpl extends AbstractDao<Integer, Usercontactform> implements IObjectDao {

    @Override
    public List<Usercontactform> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Usercontactform>) criteria.list();
    }

    @Override
    public Usercontactform findById(long id) {
        Usercontactform cf = getByKey((int) id);
        if (cf != null) {
            return cf;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Usercontactform usercontactform = (Usercontactform) entity;
        boolean save = persist(usercontactform);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Usercontactform ucf = getByKey((int) id);
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
        Usercontactform usercontactform = (Usercontactform) entity;
        Usercontactform ucf = (Usercontactform) findById(usercontactform.getId());
        if (ucf != null) {
            ucf.setUserId(usercontactform.getUserId());
            ucf.setSubject(usercontactform.getSubject());
            ucf.setMessage(usercontactform.getMessage());
            return save(ucf);
        }
        return false;
    }

}
