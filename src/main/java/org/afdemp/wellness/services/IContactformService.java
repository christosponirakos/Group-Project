package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.ContactForm;


public interface IContactformService {
    
    public List<ContactForm> findAllContactforms();
    public ContactForm findById(long id);
    public boolean save(ContactForm contactform);
    public boolean delete(long id);
    public boolean update(ContactForm contactform);
}
