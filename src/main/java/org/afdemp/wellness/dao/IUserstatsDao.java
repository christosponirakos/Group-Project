package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Userstats;



public interface IUserstatsDao {
    
    public List<Userstats> findAllUserStats();
    public Userstats findById(int id);
    public boolean save(Userstats userstats);
    public boolean delete(int id);
    public boolean update(Userstats userstats);
}
