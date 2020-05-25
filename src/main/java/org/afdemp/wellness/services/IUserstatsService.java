package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.UserStats;



public interface IUserstatsService {
    
    public List<UserStats> findAllUserStats();
    public UserStats findById(long id);
    public boolean save(UserStats userstats);
    public boolean delete(long id);
    public boolean update(UserStats userstats);
}
