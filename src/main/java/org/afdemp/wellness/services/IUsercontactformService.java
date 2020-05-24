package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.UserContactForm;

public interface IUsercontactformService {
    public List<UserContactForm> findAllUsercontactforms();
    public UserContactForm findById(long id);
    public boolean save(UserContactForm usercontactform);
    public boolean delete(long id);
    public boolean update(UserContactForm usercontactform);
}
