package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Usercontactform;

public interface IUsercontactformService {
    public List<Usercontactform> findAllUsercontactforms();
    public Usercontactform findById(int id);
    public boolean save(Usercontactform usercontactform);
    public boolean delete(int id);
    public boolean update(Usercontactform usercontactform);
}
