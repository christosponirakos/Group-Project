package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.UserContactForm;

public interface IUsercontactformDao {
    public List<UserContactForm> findAllUsercontactforms();
    public UserContactForm findById(int id);
    public boolean save(UserContactForm usercontactform);
    public boolean delete(int id);
    public boolean update(UserContactForm usercontactform);
}
