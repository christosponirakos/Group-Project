package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Userstats;



public interface IUserstatsService {
    
    public List<Userstats> findAllUserStats();
    public Userstats findById(long id);
    public boolean save(Userstats userstats);
    public boolean delete(long id);
    public boolean update(Userstats userstats);
}
