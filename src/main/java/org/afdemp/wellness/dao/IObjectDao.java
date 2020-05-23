
package org.afdemp.wellness.dao;

import java.util.List;


public interface IObjectDao {
    
    public List<Object> findAll();
    public Object findById(long id);
    public boolean save(Object object);
    public boolean delete(long id);
    public boolean update(Object object);
}
