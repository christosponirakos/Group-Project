
package org.afdemp.wellness.dao;

import java.util.List;


public interface IObjectDao<T> {
    
    public List<T> findAll();
    public Object findById(long id);
    public boolean save(T entity);
    public boolean delete(long id);
    public boolean update(T entity);
}
