package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.UserStats;



public interface IUserstatsDao {
    
    public List<UserStats> findAllUserStats();
    public UserStats findById(int id);
    public boolean save(UserStats userstats);
    public boolean delete(int id);
    public boolean update(UserStats userstats);
}
