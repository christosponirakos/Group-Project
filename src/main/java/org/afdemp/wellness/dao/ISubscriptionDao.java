
package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Subscription;


public interface ISubscriptionDao {
    public List<Subscription> findAllSubscriptions();
    public Subscription findById(int id);
    public boolean save(Subscription subscription);
    public boolean delete(int id);
    public boolean update(Subscription subscription);
}
