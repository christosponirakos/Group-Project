
package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Subscription;


public interface ISubscriptionService {
    public List<Subscription> findAllSubscriptions();
    public Subscription findById(int id);
    public boolean save(Subscription subscription);
    public boolean delete(int id);
    public boolean updateById(int id, Subscription subscription);
}
