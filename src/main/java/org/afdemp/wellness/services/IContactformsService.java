package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Contactform;


public interface IContactformsService {
    
    public List<Contactform> findAllContactforms();
    public Contactform findById(int id);
    public boolean save(Contactform contactform);
    public boolean delete(int id);
    public boolean update(Contactform contactform);
}
