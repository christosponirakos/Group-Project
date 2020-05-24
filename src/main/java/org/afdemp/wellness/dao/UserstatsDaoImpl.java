package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Userstats;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("userstatsDao")
public class UserstatsDaoImpl extends AbstractDao<Integer, Userstats> implements IObjectDao {

    @Override
    public List<Userstats> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Userstats>) criteria.list();
    }

    @Override
    public Userstats findById(long id) {
        Userstats us = getByKey((int) id);
        if (us != null) {
            return us;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Userstats contactform = (Userstats) entity;
        boolean save = persist(contactform);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Userstats us = getByKey((int) id);
        if (us != null) {
            delete(us);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Userstats userstats = (Userstats) entity;
        Userstats us = (Userstats) findById(userstats.getId());
        if (us != null) {
            us.setAge(userstats.getAge());
            us.setSex(userstats.getSex());
            us.setHeight(userstats.getHeight());
            us.setWeight(userstats.getWeight());
            us.setBmi(userstats.getBmi());
            us.setKnownallergies(userstats.getKnownallergies());
            us.setUserId(userstats.getUserId());
            return save(us);
        }
        return false;
    }

        
        
}
