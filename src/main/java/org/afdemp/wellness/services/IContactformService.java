package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Contactform;


public interface IContactformService {
    
    public List<Contactform> findAllContactforms();
    public Contactform findById(long id);
    public boolean save(Contactform contactform);
    public boolean delete(long id);
    public boolean update(Contactform contactform);
}
