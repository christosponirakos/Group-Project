
package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Subscription;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("subscriptionDao")
public class SubscriptionDaoImpl extends AbstractDao<Integer, Subscription> implements IObjectDao {

    @Override
    public List<Subscription> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Subscription>) criteria.list();
    }

    @Override
    public Subscription findById(long id) {
        Subscription s = getByKey((int) id);
        if (s != null) {
            return s;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Subscription subscription = (Subscription) entity;
        boolean save = persist(subscription);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Subscription s = getByKey((int) id);
        if (s != null) {
            delete(s);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Subscription subscription = (Subscription) entity;
        Subscription s = (Subscription) findById(subscription.getId());
        if (s != null) {
            s.setOrderId(subscription.getOrderId());
            s.setUserId(subscription.getUserId());
            s.setPurchaseDate(subscription.getPurchaseDate());
            s.setExpirationDate(subscription.getExpirationDate());
            return save(s);
        }
        return false;
    }

}
