package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.ContactForm;


public interface IContactformsDao {
    
    public List<ContactForm> findAllContactforms();
    public ContactForm findById(int id);
    public boolean save(ContactForm contactform);
    public boolean delete(int id);
    public boolean update(ContactForm contactform);
}
