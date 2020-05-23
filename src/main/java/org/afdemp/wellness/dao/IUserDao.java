package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.User;

public interface IUserDao {
    public List<User> findAllUsers();
    public User findById(long id);
    public boolean save(User user);
    public boolean delete(long id);
    public boolean update(User user);
}
